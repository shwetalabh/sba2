package com.wellsfargo.batch7.sbwibs.service;

import java.util.List;

import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.CustomerModel;

public interface CustomerService {
		
	CustomerModel validateUser(String emailId) throws IBSException;
//	CustomerModel add(CustomerModel customer) throws IBSException;
	List<CustomerModel> getAllPendingRequests()  throws IBSException;
	CustomerModel updateCustomer(long cId,String status);
}

