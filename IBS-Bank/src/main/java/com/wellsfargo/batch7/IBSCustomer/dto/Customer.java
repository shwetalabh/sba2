package com.wellsfargo.batch7.IBSCustomer.dto;

public class Customer {
	
	protected String customerID;
	protected String customerName;
	protected String mobileNum;
	protected String address;
	protected String loginPassword;
	protected String txnPassword;
	protected Integer cardPIN;
	
	public Customer() {
		
	}
	
	public String ChangePassword(String password) {
		return loginPassword;
		
	}
	
	public Integer resetPIN(Integer PIN) {
		return cardPIN;
		
	}
	
	public String IssueReport() {
		return null;
		
	}

	public Customer(String customerID, String customerName, String mobileNum, String address, String loginPassword,
			String txnPassword, Integer cardPIN) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.mobileNum = mobileNum;
		this.address = address;
		this.loginPassword = loginPassword;
		this.txnPassword = txnPassword;
		this.cardPIN = cardPIN;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getTxnPassword() {
		return txnPassword;
	}

	public void setTxnPassword(String txnPassword) {
		this.txnPassword = txnPassword;
	}

	public Integer getCardPIN() {
		return cardPIN;
	}

	public void setCardPIN(Integer cardPIN) {
		this.cardPIN = cardPIN;
	}

		
}
