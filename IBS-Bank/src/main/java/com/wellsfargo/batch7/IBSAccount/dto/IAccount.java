package com.wellsfargo.batch7.IBSAccount.dto;

public interface IAccount {
	
	 default String getAccountInfo() {
		return null;
	 }
	

	default String Statements() {
		return null;
		
	}
	
	default String BalanceCheck() {
		return null;
		
	}
}
