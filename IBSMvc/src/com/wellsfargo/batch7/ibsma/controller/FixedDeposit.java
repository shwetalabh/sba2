package com.wellsfargo.batch7.ibsma.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wellsfargo.batc7.ibsma.model.Account;
import com.wellsfargo.batch7.ibsma.service.AccountServiceImpl;
import com.wellsfargo.batch7.ibsma.service.IAccountService;

/**
 * Servlet implementation class FixedDeposit
 */
@WebServlet("/fd")
public class FixedDeposit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IAccountService accountService;
	public void init(ServletConfig config) throws ServletException {
		accountService = new AccountServiceImpl();

	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Account account = new Account();
		account.setAmountDeposit(Double.parseDouble(request.getParameter("amountDeposit")));
		account.setInterestRate(Double.parseDouble(request.getParameter("interestRate")));
		account.setDepositDate(LocalDate.parse(request.getParameter("depositDate")));
		account.setMaturityDate(LocalDate.parse(request.getParameter("maturityDate")));		
		
		account = accountService.fixedDepositInterest(account);
		
		request.setAttribute("account", account);
		String view = "fixedDeposit_display_page.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
