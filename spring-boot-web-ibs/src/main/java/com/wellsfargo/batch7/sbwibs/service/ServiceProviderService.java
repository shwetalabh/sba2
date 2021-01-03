package com.wellsfargo.batch7.sbwibs.service;

import java.util.List;

import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.ServiceProviderModel;

public interface ServiceProviderService {
		
	List<ServiceProviderModel> getAllPendingRequests()  throws IBSException;

	ServiceProviderModel validateUser(String emailId) throws IBSException;
}

