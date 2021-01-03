package com.wellsfargo.batch7.ibsma.controller;

import java.io.IOException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wellsfargo.batc7.ibsma.model.Customer;
import com.wellsfargo.batch7.ibsma.service.CustomeServiceImpl;
import com.wellsfargo.batch7.ibsma.service.iCustomerService;


@WebServlet("/sgin")
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private iCustomerService customerService;
	
	public void init(ServletConfig config) throws ServletException {

		customerService = new CustomeServiceImpl();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();
		
		customer.setCustomerName((request.getParameter("customerName")));
		customer.setPassword((request.getParameter("password")));

		customer = customerService.welcome(customer);
		
		request.setAttribute("customer", customer);
		
		String view = "welcome.jsp";

		request.getRequestDispatcher(view).forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
