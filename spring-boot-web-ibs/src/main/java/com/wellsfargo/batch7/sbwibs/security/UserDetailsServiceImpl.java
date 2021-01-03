package com.wellsfargo.batch7.sbwibs.security;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.wellsfargo.batch7.sbwibs.util.EMParser;
import com.wellsfargo.batch7.sbwibs.entity.CustomerEntity;
import com.wellsfargo.batch7.sbwibs.entity.IbsUserEntity;
import com.wellsfargo.batch7.sbwibs.entity.ServiceProviderEntity;
import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.AccountModel;
import com.wellsfargo.batch7.sbwibs.model.CustomerModel;
import com.wellsfargo.batch7.sbwibs.model.ServiceProviderModel;
import com.wellsfargo.batch7.sbwibs.repo.AccountRepo;
import com.wellsfargo.batch7.sbwibs.repo.CustomerRepo;
import com.wellsfargo.batch7.sbwibs.repo.IbsUserRepo;
import com.wellsfargo.batch7.sbwibs.repo.ServiceProviderRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private IbsUserRepo userRepo;

	@Autowired
	private AccountRepo accountRepo;

	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private ServiceProviderRepo spRepo;

	@Autowired
	private PasswordEncoder encoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		if (!userRepo.existsByUserName(username)) {
			throw new UsernameNotFoundException("Invalid user credentials!");
		}

		IbsUserEntity user = userRepo.findByUserName(username);

		return new User(user.getUserName(), user.getPassword(),
				Collections.singletonList(new SimpleGrantedAuthority(user.getRole())));
	}

	@Transactional
	public void register(CustomerModel user) throws IBSException {
		if (user != null) {
			if (user.getPassword().equals(user.getConfirmPassword())) {
				user.setPassword(encoder.encode(user.getPassword()));
				LocalDate depositDate = LocalDate.now();
				AccountModel account = new AccountModel(null, "savings", 1000.0, 4.75, depositDate, null, null, null,
						null, null, 1000.0, user);
				account.setCustomer(EMParser.parse(userRepo.save(EMParser.parse(user))));
				accountRepo.save(EMParser.parse(account));

			} else {
				throw new IBSException("Password do not match");
			}
		}
	}

	@Transactional
	public void add(CustomerModel customer) throws IBSException {

		if (customerRepo.existsByEmailId(customer.getEmailId())) {
			
			throw new IBSException("Customer with email Id " + customer.getEmailId() + " already exists");
		}
		if (customerRepo.existsByPhoneNumber(customer.getPhoneNumber())) {
			throw new IBSException("Customer with phone Number " + customer.getPhoneNumber() +" already exists");
		}
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String password = customer.getCustomerName().substring(0, 4)
				.concat(String.valueOf(customer.getDateOfBirth().getYear()));
		customer.setUserName(String.valueOf(timestamp.getTime()));
		customer.setPassword(encoder.encode(password));
		customer.setRole("NEWUSER");
		LocalDate depositDate = LocalDate.now();
		AccountModel account = new AccountModel(null, customer.getAccount().getAccountType(), 1000.0, 4.75, depositDate, null, null, null, null,
				null, 1000.0, customer);
		account.setCustomer(EMParser.parse(userRepo.save(EMParser.parse(customer))));
		accountRepo.save(EMParser.parse(account));

	}

	@Transactional
	@Modifying
	public void resetPassword(String userName, String Password, String ConfirmPassword, String role) throws IBSException {

		if(role.equals("NEWUSER")) {
		Optional<CustomerEntity> optionalCustomer =customerRepo.findByUserName(userName);
		CustomerEntity customer=optionalCustomer.get();
		if(customer.getRegistrationStatus().equals("approved"))
		{	
			customer.setRole("USER");
			customer.setRegistrationStatus("completed");
		}
		
		if (Password.equals(ConfirmPassword)) {
			customer.setPassword(encoder.encode(Password));
			userRepo.save(customer);
		} else {
			throw new IBSException("Password do not match");
		}
		}
		if(role.equals("NEWSP")) {
			Optional<ServiceProviderEntity> optionalSP =spRepo.findByUserName(userName);
			ServiceProviderEntity sp=optionalSP.get();
			if(sp.getRegistrationStatus().equals("approved"))
			{	
				sp.setRole("SP");
				sp.setRegistrationStatus("completed");
			}
			
			if (Password.equals(ConfirmPassword)) {
				sp.setPassword(encoder.encode(Password));
				userRepo.save(sp);
			} else {
				throw new IBSException("Password do not match");
			}
			}
	}

	@Transactional
	public void addServiceProvider(@Valid ServiceProviderModel serviceProvider) throws IBSException {

		if (spRepo.existsByEmailId(serviceProvider.getEmailId())) {
			
			throw new IBSException("Service Provider with email Id " + serviceProvider.getEmailId() + " already exists");
		}
		if (spRepo.existsByPhoneNumber(serviceProvider.getPhoneNumber())) {
			throw new IBSException("Service Provider with phone Number " + serviceProvider.getPhoneNumber() +" already exists");
		}
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String password = serviceProvider.getCustomerName().substring(0, 4)
				.concat(String.valueOf(serviceProvider.getDateOfBirth().getYear()));
		serviceProvider.setUserName(String.valueOf(timestamp.getTime()));
		serviceProvider.setPassword(encoder.encode(password));
		serviceProvider.setRole("NEWSP");
		userRepo.save(EMParser.parse(serviceProvider));
	}
}
