package com.wellsfargo.batc7.ibsma.model;

public class ServiceProvider {
	
	private String proprietorName;
	
	private String accountNumber;

	private String displayName;

	private String category;
	
	public ServiceProvider() {
		
	}

	public ServiceProvider(String proprietorName, String accountNumber, String displayName, String category) {
		super();
		this.proprietorName = proprietorName;
		this.accountNumber = accountNumber;
		this.displayName = displayName;
		this.category = category;
	}

	public String getProprietorName() {
		return proprietorName;
	}

	public void setProprietorName(String proprietorName) {
		this.proprietorName = proprietorName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
