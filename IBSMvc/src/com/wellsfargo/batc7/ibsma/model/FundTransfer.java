package com.wellsfargo.batc7.ibsma.model;

public class FundTransfer {

private String accountNumber;
	
	private String ifscCode;

	private String payeeName;

	private String mobileNumber;

	private String emailID;
	
	
	public FundTransfer() {
		
	}


	public FundTransfer(String accountNumber, String ifscCode, String payeeName, String mobileNumber, String emailID) {
		super();
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.payeeName = payeeName;
		this.mobileNumber = mobileNumber;
		this.emailID = emailID;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}


	public String getPayeeName() {
		return payeeName;
	}


	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	

}
