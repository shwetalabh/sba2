package com.wellsfargo.batch7.sbwibs.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.CustomerModel;
import com.wellsfargo.batch7.sbwibs.service.CustomerServiceImpl;
import com.wellsfargo.batch7.sbwibs.service.ServiceProviderServiceImpl;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private CustomerServiceImpl customerService;
	
	@Autowired
	private ServiceProviderServiceImpl spService;

	@GetMapping
	public ModelAndView savingsAccountAction(HttpServletRequest request) throws IBSException {
//		Principal principal=request.getUserPrincipal();
//		String currentUserName=principal.getName();
		List<CustomerModel> customers=customerService.getAllPendingRequests();
		ModelAndView mv = new ModelAndView("/admin","customers",customers);
		mv.addObject("serviceproviders",spService.getAllPendingRequests());
		return mv;
	}

	@GetMapping("/approve")
	public ModelAndView approveRegistration(@RequestParam("cid") long cId) throws IBSException {
		customerService.updateCustomer(cId,"approved");
		ModelAndView mv = new ModelAndView("redirect:/admin");
		return mv;
	}
	
	@GetMapping("/reject")
	public ModelAndView rejectRegistration(@RequestParam("cid") long cId) throws IBSException {
		customerService.updateCustomer(cId,"declined");
		ModelAndView mv = new ModelAndView("redirect:/admin");
		return mv;
	}
	
	@GetMapping("/approveSP")
	public ModelAndView approveSPRegistration(@RequestParam("spid") long spid) throws IBSException {
		spService.updateCustomer(spid,"approved");
		ModelAndView mv = new ModelAndView("redirect:/admin");
		return mv;
	}
	
	@GetMapping("/rejectSP")
	public ModelAndView rejectSPRegistration(@RequestParam("spid") long spid) throws IBSException {
		spService.updateCustomer(spid,"declined");
		ModelAndView mv = new ModelAndView("redirect:/admin");
		return mv;
	}
}