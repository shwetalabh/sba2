package com.wellsfargo.batch7.sbwibs.service;

import com.wellsfargo.batch7.sbwibs.entity.ServiceProviderEntity;
import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.CustomerModel;
import com.wellsfargo.batch7.sbwibs.model.ServiceProviderModel;
import com.wellsfargo.batch7.sbwibs.repo.ServiceProviderRepo;
import com.wellsfargo.batch7.sbwibs.util.EMParser;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProviderServiceImpl implements ServiceProviderService {

	@Autowired
	private ServiceProviderRepo spRepo;

	@Override
	public List<ServiceProviderModel> getAllPendingRequests() throws IBSException {

		return spRepo.getAllPendingApplications("pending").stream().map(e -> EMParser.parse(e))
				.collect(Collectors.toList());
	}

	@Override
	public ServiceProviderModel validateUser(String emailId) throws IBSException {

		if (!spRepo.existsByEmailId(emailId)) {
			throw new IBSException("Email Id does not exists");
		}
		return EMParser.parse(spRepo.findByEmailId(emailId));
	}

	public ServiceProviderModel updateCustomer(long spid, String status) {
		Optional<ServiceProviderEntity> serviceproviders = spRepo.findById(spid);
		ServiceProviderEntity serviceprovider = null;
		if (serviceproviders.isPresent()) {
			serviceprovider = serviceproviders.get();
			serviceprovider.setRegistrationStatus(status);
		}
		return EMParser.parse(spRepo.save(serviceprovider));
	}

}
