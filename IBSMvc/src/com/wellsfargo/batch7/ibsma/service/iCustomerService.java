package com.wellsfargo.batch7.ibsma.service;

import com.wellsfargo.batc7.ibsma.model.Customer;

public interface iCustomerService {
	
	Customer forgotPassword(Customer customer);
	Customer welcome(Customer customer);

}
