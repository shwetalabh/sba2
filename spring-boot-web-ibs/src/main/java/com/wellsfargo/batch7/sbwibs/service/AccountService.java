package com.wellsfargo.batch7.sbwibs.service;

import java.util.List;

import javax.validation.Valid;

import com.wellsfargo.batch7.sbwibs.exception.IBSException;
import com.wellsfargo.batch7.sbwibs.model.AccountModel;

public interface AccountService {

	AccountModel createSavingsAccount(@Valid AccountModel account, String currentUserName) throws IBSException;
	AccountModel createFixedDeposit(@Valid AccountModel account, String currentUserName) throws IBSException;
	AccountModel createRecurringDeposit(@Valid AccountModel account, String currentUserName) throws IBSException;
	List<AccountModel> getAllFixedDepositAccount(String currentUserName) throws IBSException;
	List<AccountModel> getAllRecurringDepositAccount(String currentUserName)throws IBSException;
	List<AccountModel> getAllSavingsAccount(String currentUserName) throws IBSException;
	
}
