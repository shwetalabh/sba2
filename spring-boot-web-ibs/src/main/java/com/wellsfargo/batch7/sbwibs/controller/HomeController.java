package com.wellsfargo.batch7.sbwibs.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping({"","/","/home"})
	public String homeAction() {
		return "home-page";
	}
	
	@RequestMapping("/header")
	public ModelAndView headerAction() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("header-fragment");
		return mv;
	}
	
	@RequestMapping("/signin")
	public ModelAndView signinAction() {
		ModelAndView mv1 = new ModelAndView();
		mv1.setViewName("signin");
		return mv1;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signupAction() {
		ModelAndView mv2 = new ModelAndView();
		mv2.setViewName("signup");
		return mv2;
	}
	
	@RequestMapping("/signout")
	public ModelAndView signoutAction() {
		ModelAndView mv2 = new ModelAndView();
		mv2.setViewName("signin");
		return mv2;
	}
	
	@RequestMapping("/header1")
	public ModelAndView header1Action() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("header-fragment1");

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {			
			mv.addObject("role",auth.getAuthorities().stream().findFirst().get().getAuthority());
			mv.addObject("userName",auth.getName());
		}

		return mv;
	}
	
	@RequestMapping("/fundtransferHeader")
	public ModelAndView fundtransferHeader() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/fundtransfer/fundtransferHeader");

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {			
			mv.addObject("role",auth.getAuthorities().stream().findFirst().get().getAuthority());
			mv.addObject("userName",auth.getName());
		}

		return mv;
	}
	
	@RequestMapping("/accountsHeader")
	public ModelAndView accountsHeader() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/accounts/accounts-header");

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {			
			mv.addObject("role",auth.getAuthorities().stream().findFirst().get().getAuthority());
			mv.addObject("userName",auth.getName());
		}

		return mv;
	}
	
	

}