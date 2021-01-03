package com.wellsfargo.batch7.sbwibs.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.CustomerModel;
import com.wellsfargo.batch7.sbwibs.security.UserDetailsServiceImpl;
import com.wellsfargo.batch7.sbwibs.service.CustomerService;

@Controller
@RequestMapping
public class PasswordController {

	@Autowired
	private UserDetailsServiceImpl userService;

	@Autowired
	private CustomerService customerService;

	@GetMapping("/forgotPassword")
	public ModelAndView displayForgotPasswordPage() throws IBSException {
		return new ModelAndView("/signin/forgotpassword");
	}

	@PostMapping("/forgotPassword")
	public ModelAndView processForgotPasswordForm(ModelAndView modelAndView, @RequestParam("emailId") String emailId)
			throws IBSException {
		CustomerModel customer = customerService.validateUser(emailId);
		if (customer != null) {
			modelAndView.setViewName("signin/resetpassword");

		} else {
			modelAndView.addObject("errorMsg", "User doesnt exists");
			modelAndView.setViewName("redirect:/forgotPassword");
		}
		return modelAndView;
	}

	@GetMapping("/changePassword")
	public ModelAndView displayChangePasswordPage() throws IBSException {
		return new ModelAndView("/signin/changePassword");
	}

	@PostMapping("/forgotPassword/reset")
	public ModelAndView resetPassword(ModelAndView modelAndView, @RequestParam("userName") String userName,
			@RequestParam("password") String password, @RequestParam("confirmPassword") String confirmPassword)
			throws IBSException {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		String role=auth.getAuthorities().stream().findFirst().get().getAuthority();

		userService.resetPassword(userName, password, confirmPassword,role);
		modelAndView.setViewName("redirect:/signin");
		return modelAndView;
	}

	@PostMapping("/changePassword")
	public ModelAndView changePassword(ModelAndView modelAndView, @RequestParam("password") String password,
			@RequestParam("newPassword") String newPassword,
			@RequestParam("confirmNewPassword") String confirmNewPassword, HttpServletRequest request)
			throws IBSException {

		Principal principal = request.getUserPrincipal();
		String userName = principal.getName();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		String role=auth.getAuthorities().stream().findFirst().get().getAuthority();

		if (!newPassword.equals(confirmNewPassword)) {
			modelAndView.addObject("errorMsg", "Passwords doesn't match");
			modelAndView.setViewName("/signin/changePassword");

		} else if (newPassword.equals(password)) {
			modelAndView.addObject("errorMsg", "New and Old Passwords are same");
			modelAndView.setViewName("/signin/changePassword");
		} else {
			userService.resetPassword(userName, newPassword, confirmNewPassword,role);
			modelAndView.setViewName("redirect:/signin/home");
		}
		return modelAndView;
	}
}
