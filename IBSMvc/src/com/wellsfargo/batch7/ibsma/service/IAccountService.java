package com.wellsfargo.batch7.ibsma.service;

import com.wellsfargo.batc7.ibsma.model.Account;

public interface IAccountService {
 Account fixedDepositInterest(Account account);
 Account recuuringDepositInterest(Account account);
}
