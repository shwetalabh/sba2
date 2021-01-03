package com.wellsfargo.batch7.sbwibs.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.batch7.sbwibs.entity.CustomerEntity;
import com.wellsfargo.batch7.sbwibs.entity.IbsUserEntity;
import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.AccountModel;

import com.wellsfargo.batch7.sbwibs.repo.AccountRepo;
import com.wellsfargo.batch7.sbwibs.repo.CustomerRepo;
import com.wellsfargo.batch7.sbwibs.repo.IbsUserRepo;
import com.wellsfargo.batch7.sbwibs.util.EMParser;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private IbsUserRepo userRepo;

	@Autowired
	private AccountRepo accountRepo;

	@Autowired
	private CustomerRepo customerRepo;

	/*
	 * @Override public AccountModel createSavingsAccount(@Valid AccountModel
	 * account) throws IBSException {
	 * 
	 * CustomerEntity customer =
	 * customerRepo.findByEmailId("p.munirajkumar@gmail.com");
	 * 
	 * LocalDate depositDate = LocalDate.now(); AccountModel account = new
	 * AccountModel(null, "savings", 1000.0, 4.75, depositDate, null, null, null,
	 * null, null, 1000.0, EMParser.parse(customer));
	 * 
	 * customer.setSavAccount(new TreeSet<>());
	 * customer.getSavAccount().add(EMParser.parse(account));
	 * customerRepo.save(customer);
	 * 
	 * 
	 * account.setCustomer(EMParser.parse(customer)); return
	 * EMParser.parse(accountRepo.save(EMParser.parse(account)));
	 * 
	 * 
	 * accountRepo.save(EMParser.parse(account)); return account;
	 * 
	 * }
	 */

	@Override
	public AccountModel createSavingsAccount(@Valid AccountModel account, String currentUserName) {

		IbsUserEntity user = userRepo.findByUserName(currentUserName);
		Optional<CustomerEntity> optionalCustomer = customerRepo.findById(user.getUserId());
		if (optionalCustomer.isPresent()) {
			CustomerEntity customer = optionalCustomer.get();
			account.setCustomer(EMParser.parse(customer));
		}
		return EMParser.parse(accountRepo.save(EMParser.parse(account)));

	}
	@Override
	public List<AccountModel> getAllSavingsAccount(String currentUserName) throws IBSException {
		IbsUserEntity user = userRepo.findByUserName(currentUserName);
		Optional<CustomerEntity> optionalCustomer = customerRepo.findById(user.getUserId());
		CustomerEntity customer = new CustomerEntity();
		if (optionalCustomer.isPresent()) {
			customer = optionalCustomer.get();
		} else {
			throw new IBSException("No customer available");
		}
		return accountRepo.findAllSavingsAccountByCustomer(customer.getUserId()).stream().map(e -> EMParser.parse(e))
				.collect(Collectors.toList());
	}

	@Override
	public AccountModel createFixedDeposit(@Valid AccountModel account, String currentUserName) throws IBSException {
		IbsUserEntity user = userRepo.findByUserName(currentUserName);
		Optional<CustomerEntity> optionalCustomer = customerRepo.findById(user.getUserId());
		if (optionalCustomer.isPresent()) {
			CustomerEntity customer = optionalCustomer.get();
			account.setCustomer(EMParser.parse(customer));
		}
		return EMParser.parse(accountRepo.save(EMParser.parse(account)));

	}

	@Override
	public List<AccountModel> getAllFixedDepositAccount(String currentUserName) throws IBSException {
		IbsUserEntity user = userRepo.findByUserName(currentUserName);
		Optional<CustomerEntity> optionalCustomer = customerRepo.findById(user.getUserId());
		CustomerEntity customer = new CustomerEntity();
		if (optionalCustomer.isPresent()) {
			customer = optionalCustomer.get();
		} else {
			throw new IBSException("No customer available");
		}
		return accountRepo.findAllFixedDepositByCustomer(customer.getUserId()).stream().map(e -> EMParser.parse(e))
				.collect(Collectors.toList());
	}
	
	@Override
	public AccountModel createRecurringDeposit(@Valid AccountModel account, String currentUserName) {
		IbsUserEntity user = userRepo.findByUserName(currentUserName);
		Optional<CustomerEntity> optionalCustomer = customerRepo.findById(user.getUserId());
		if (optionalCustomer.isPresent()) {
			CustomerEntity customer = optionalCustomer.get();
			account.setCustomer(EMParser.parse(customer));
		}
		return EMParser.parse(accountRepo.save(EMParser.parse(account)));
	}

	@Override
	public List<AccountModel> getAllRecurringDepositAccount(String currentUserName) throws IBSException {
		IbsUserEntity user = userRepo.findByUserName(currentUserName);
		Optional<CustomerEntity> optionalCustomer = customerRepo.findById(user.getUserId());
		CustomerEntity customer = new CustomerEntity();
		if (optionalCustomer.isPresent()) {
			customer = optionalCustomer.get();
		} else {
			throw new IBSException("No customer available");
		}
		return accountRepo.findAllRecurringDepositByCustomer(customer.getUserId()).stream().map(e -> EMParser.parse(e))
				.collect(Collectors.toList());
	}

	

	

}
