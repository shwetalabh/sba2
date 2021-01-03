package com.wellsfargo.batch7.sbwibs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch7.sbwibs.security.UserDetailsServiceImpl;
import com.wellsfargo.batch7.sbwibs.service.CustomerServiceImpl;
import com.wellsfargo.batch7.sbwibs.service.ServiceProviderServiceImpl;
import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.CustomerModel;
import com.wellsfargo.batch7.sbwibs.model.ServiceProviderModel;

@Controller
@RequestMapping("/signup")
public class SignupController {

	@Autowired
	private UserDetailsServiceImpl userService;

	@Autowired
	private CustomerServiceImpl customerService;

	@Autowired
	private ServiceProviderServiceImpl spService;

	@GetMapping
	public ModelAndView displaySignup() throws IBSException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup");
		mv.addObject("customer", new CustomerModel());
		return mv;
	}

	@PostMapping
	public ModelAndView addCustomer(@ModelAttribute("customer") @Valid CustomerModel customer, BindingResult result)
			throws IBSException {

		ModelAndView mv = null;
		if (result.hasErrors()) {
			mv = new ModelAndView("signup", "customer", customer);
		} else {
			userService.add(customer);
			mv = new ModelAndView("redirect:/upload");
		}
		return mv;
	}

	@PostMapping("/serviceprovider")
	public ModelAndView addServiceProvider(@ModelAttribute("customer") @Valid ServiceProviderModel serviceProvider,
			BindingResult result) throws IBSException {

		ModelAndView mv = null;
		if (result.hasErrors()) {
			mv = new ModelAndView("signup", "customer", serviceProvider);
		} else {
			userService.addServiceProvider(serviceProvider);
			mv = new ModelAndView("redirect:/upload");
		}
		return mv;
	}

	@GetMapping("/trackRegistration")
	public String displayTrackRegistration() throws IBSException {
		String viewName = "track-registration-status";
		return viewName;
	}

	@PostMapping("/trackRegistration")
	public ModelAndView processTrackRegistration(ModelAndView modelAndView, @RequestParam("emailId") String emailId,
			@RequestParam("role") String role) throws IBSException {
		CustomerModel customer = null;
		ServiceProviderModel serviceProvider = null;

		if (role.equals("USER")) {
			customer = customerService.validateUser(emailId);
		}
		if (role.equals("Service Provider")) {
			serviceProvider = spService.validateUser(emailId);
		}
		modelAndView.setViewName("track-registration-status");
		if (serviceProvider != null) {
			if (serviceProvider.getRegistrationStatus().equals("pending")) {
				modelAndView.addObject("alertMsg", "Registration is still pending.. Thanks for your patience!!");
			}
			if (serviceProvider.getRegistrationStatus().equals("approved")) {
				modelAndView.addObject("successMsg",
						" Hurray !! registration is approved .. please login with the user name "
								+ serviceProvider.getUserName()
								+ " and <br> password combination of first 4 letters of your name followed by your birth year in yyyy format !!");
			}
			if (serviceProvider.getRegistrationStatus().equals("declined")) {
				modelAndView.addObject("errorMsg",
						" Registration request is declined Please contact ADMIN for more details.");
			}
			if (serviceProvider.getRegistrationStatus().equals("completed")) {
				modelAndView.addObject("alertMsg",
						"Registration is already completed. Please sign in with your credentials");
			}

		}
		if (customer != null) {
			if (customer.getRegistrationStatus().equals("pending")) {
				modelAndView.addObject("alertMsg", "Registration is still pending.. Thanks for your patience!!");
			}
			if (customer.getRegistrationStatus().equals("approved")) {
				modelAndView.addObject("successMsg",
						" Hurray !! registration is approved .. please login with the user name "
								+ customer.getUserName()
								+ " and <br> password combination of first 4 letters of your name followed by your birth year in yyyy format !!");
			}
			if (customer.getRegistrationStatus().equals("declined")) {
				modelAndView.addObject("errorMsg",
						" Registration request is declined Please contact ADMIN for more details.");
			}
			if (customer.getRegistrationStatus().equals("completed")) {
				modelAndView.addObject("alertMsg",
						"Registration is already completed. Please sign in with your credentials");
			}

		}
		return modelAndView;
	}

}
