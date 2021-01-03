package com.wellsfargo.batch7.sbwibs.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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

import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.AccountModel;
import com.wellsfargo.batch7.sbwibs.model.FundTransferModel;
import com.wellsfargo.batch7.sbwibs.service.AccountService;
import com.wellsfargo.batch7.sbwibs.service.AccountServiceImpl;
import com.wellsfargo.batch7.sbwibs.service.FundTransferService;
import com.wellsfargo.batch7.sbwibs.service.FundTransferServiceImpl;

@Controller
@RequestMapping("/fundtransfer")
public class FundTransferController {
	
	@Autowired
	private FundTransferServiceImpl fundTransferService;
	
	@Autowired
	private AccountServiceImpl accountService;
	
	@GetMapping
	public String fundTransferAction() throws IBSException {
		return "fundtransfer/fundtransfer";
	}
	
	@GetMapping("/beneficiaryList")
	public ModelAndView getAllBeneficiaryAction(HttpServletRequest request) throws IBSException {
		Principal principal=request.getUserPrincipal();
		String currentUserName=principal.getName();
		List<FundTransferModel> beneficiary= fundTransferService.getAll();				
		ModelAndView mv = new ModelAndView("/fundtransfer/beneficiaryList","beneficiary",beneficiary);
		return mv;
	}
	
	@GetMapping("/newBeneficiary")
	public ModelAndView newBeneficiaryAction(HttpServletRequest request) throws IBSException {
		ModelAndView mv = new ModelAndView("fundtransfer/newBeneficiary","beneficiary",new FundTransferModel());
		Principal principal = request.getUserPrincipal();
		String userName = principal.getName();
		mv.addObject("isNew",true);
		mv.addObject("accounts", accountService.getAllSavingsAccount(userName));
		return mv;
	}
	@GetMapping("/edit")
	public ModelAndView editBeneficiaryAction(HttpServletRequest request, @RequestParam("benefAccNum")long benefAccNum) throws IBSException {
		FundTransferModel beneficiary = fundTransferService.get(benefAccNum);
		ModelAndView mv = new ModelAndView("fundtransfer/newBeneficiary","beneficiary",beneficiary);
		Principal principal = request.getUserPrincipal();
		String userName = principal.getName();
//		ModelAndView mv = new ModelAndView("contacts/contact-form-page","contact",contact);
		mv.addObject("isNew",false);
		mv.addObject("accounts", accountService.getAllSavingsAccount(userName));
		return mv;
	}
	
	
	@PostMapping("/newBeneficiary")
	public ModelAndView addBeneficiaryAction(
			@ModelAttribute("beneficiary") @Valid FundTransferModel beneficiary,
			BindingResult result
			) throws IBSException {
		ModelAndView mv=null;		
		if(result.hasErrors()) {
			mv = new ModelAndView("fundtransfer/newBeneficiary","beneficiary",beneficiary);
			mv.addObject("isNew",true);
		}else {
			fundTransferService.add(beneficiary);
			mv = new ModelAndView("redirect:/fundtransfer/beneficiaryList");
		}
		
		return mv;
	}
	
	@PostMapping("/update")	
	public ModelAndView updateBeneficiaryAction(
			@ModelAttribute("beneficiary") @Valid FundTransferModel beneficiary,
			BindingResult result
			) throws IBSException {
		ModelAndView mv=null;	
		
		if(result.hasErrors()) {
			mv = new ModelAndView("fundtransfer/newBeneficiary","beneficiary",beneficiary);
			mv.addObject("isNew",false);
		}else {
			fundTransferService.update(beneficiary);
			mv = new ModelAndView("redirect:/fundtransfer/beneficiaryList");
		}
		
		return mv;
	}	
	
	@GetMapping("/amountTransfer")
	public ModelAndView amountTransferAction(HttpServletRequest request) throws IBSException {
		ModelAndView mv = new ModelAndView("fundtransfer/amountTransfer","fund",new FundTransferModel());
		Principal principal = request.getUserPrincipal();
		String userName = principal.getName();
		mv.addObject("accounts", accountService.getAllSavingsAccount(userName));
		mv.addObject("fundTransfers", fundTransferService.getAll());
		return mv;
	}
	@PostMapping("/amountTransfer")
	public ModelAndView fundTransferAction(
			@ModelAttribute("fund") @Valid FundTransferModel fund,
			BindingResult result,HttpServletRequest request) throws IBSException {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("fundtransfer/amountTransfer");
		Principal principal=request.getUserPrincipal();
		String currentUserName=principal.getName();
		if(result.hasErrors()) {
			mv.addObject("fund",fund);	
		}else {
//			fundTransferService.createFixedDeposit(account,currentUserName);
			fundTransferService.transferFund(fund);
			mv = new ModelAndView("redirect:/fundtransfer/transactionsList");
		}
		return mv;
	}
	@GetMapping("/transactionsList")
	public ModelAndView getAllTransactionAction(HttpServletRequest request) throws IBSException {
		Principal principal=request.getUserPrincipal();
		String currentUserName=principal.getName();
		List<FundTransferModel> fund= fundTransferService.getAllTransactions();		
		ModelAndView mv = new ModelAndView("/fundtransfer/transactionsList","fund",fund);
		return mv;
	}
	

}
