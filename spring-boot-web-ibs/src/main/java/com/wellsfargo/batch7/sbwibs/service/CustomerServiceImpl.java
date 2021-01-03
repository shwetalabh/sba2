package com.wellsfargo.batch7.sbwibs.service;

import com.wellsfargo.batch7.sbwibs.entity.CustomerEntity;
import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.CustomerModel;
import com.wellsfargo.batch7.sbwibs.repo.CustomerRepo;
import com.wellsfargo.batch7.sbwibs.util.EMParser;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	
	@Override
	public CustomerModel validateUser(String emailId) throws IBSException {

		if (!customerRepo.existsByEmailId(emailId)) {
			throw new IBSException("Email Id does not exists");
		}
		return EMParser.parse(customerRepo.findByEmailId(emailId));
	}

	
	@Override
	public List<CustomerModel> getAllPendingRequests() {
		 return customerRepo.getAllPendingApplications("pending").stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
	}


	@Override
	public CustomerModel updateCustomer(long cId,String status) {
		Optional<CustomerEntity> customers  = customerRepo.findById(cId);
		CustomerEntity customer=null;
		if(customers.isPresent()) {
			customer=customers.get();
			customer.setRegistrationStatus(status);
			
		}
		return EMParser.parse(customerRepo.save(customer));
	}

}
