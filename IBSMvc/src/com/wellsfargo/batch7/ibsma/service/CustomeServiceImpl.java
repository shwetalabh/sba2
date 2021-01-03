package com.wellsfargo.batch7.ibsma.service;

import com.wellsfargo.batc7.ibsma.model.Customer;

public class CustomeServiceImpl implements iCustomerService {
	
	@Override
	public Customer forgotPassword(Customer customer) {

		return customer;

	}
	
	@Override
	public Customer welcome(Customer customer) {
		
		if(customer!=null) {

			//String customerName = customer.getCustomerName();
			
		//	customer.setCustomerName(customerName);

		}

		return customer;

	}




}
