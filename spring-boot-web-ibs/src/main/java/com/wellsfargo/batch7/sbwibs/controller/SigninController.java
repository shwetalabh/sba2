package com.wellsfargo.batch7.sbwibs.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.IbsUserModel;

@Controller
@RequestMapping("/signin")
public class SigninController {
	
	@GetMapping
	public ModelAndView signInAction() throws IBSException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signin");
		mv.addObject("group",new IbsUserModel());
		return mv;
	}
	
	@GetMapping("/sp-home")
	public ModelAndView sphomeAction() throws IBSException {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/signin/sp-home");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {			
			mv.addObject("role",auth.getAuthorities().stream().findFirst().get().getAuthority());
			mv.addObject("userName",(auth.getName()).toUpperCase());
		}

		return mv;
	}
	
	@GetMapping("/home")
	public ModelAndView homeAction() throws IBSException {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/signin/home");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {			
			mv.addObject("role",auth.getAuthorities().stream().findFirst().get().getAuthority());
			mv.addObject("userName",(auth.getName()).toUpperCase());
		}

		return mv;
	}


}
