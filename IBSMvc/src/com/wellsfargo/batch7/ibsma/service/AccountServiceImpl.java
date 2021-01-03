package com.wellsfargo.batch7.ibsma.service;

import java.time.Period;

import com.wellsfargo.batc7.ibsma.model.Account;
import com.wellsfargo.batch7.ibsma.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

	@Override
	public Account fixedDepositInterest(Account account) {
		if(account!=null) {
			double time = Period.between(account.getDepositDate(),account.getMaturityDate())
					.toTotalMonths()/12.0;
			double interest = time*account.getAmountDeposit()*account.getInterestRate();
			double amtReceiveable = account.getAmountDeposit()+interest;
			
			account.setTimeInYears(time);
			account.setInterestRate(interest);
			account.setMaturityAmount(amtReceiveable);
		}
		return account;
	}

	@Override
	public Account recuuringDepositInterest(Account account) {
		if(account!=null) {
			double time = Period.between(account.getDepositDate(),account.getMaturityDate())
					.toTotalMonths();
			double interest = time*account.getAmountDeposit()*(account.getInterestRate())/12.0;			
			double amtReceiveable = account.getAmountDeposit()+interest;			
			account.setTimeInMonths(time);
			account.setInterestRate(interest);
			account.setMaturityAmount(amtReceiveable);
		}
		return account;
	}

}
