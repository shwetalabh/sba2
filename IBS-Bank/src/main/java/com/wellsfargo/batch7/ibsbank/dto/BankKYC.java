package com.wellsfargo.batch7.ibsbank.dto;

public class BankKYC extends Customer{
	
	private String refID;
	protected String customerName;
	protected String mobileNum;
	protected String email;
	protected String docUpload;
	protected String KYCStatus;
	
	//Customer cust=new Customer();
	//ServiceProvider sp=new ServiceProvider();
	
	public BankKYC() {
		
	}
	
	public String generateCID() {
		return customerID;
		
	}
	
	
	public String generateSpID() {
		//return sp.SpID;	
		return null;
	}
	
	public boolean verifyKYC() {
		return true;
		
	}
	
	public String generatePassword() {
		return loginPassword;
		
	}
	
	public Integer generatePIN() {
		return cardPIN;
		
	}
	
	public BankKYC(String refID, String customerName, String mobileNum, String email, String docUpload,
			String kYCStatus) {
		super();
		this.refID = refID;
		this.customerName = customerName;
		this.mobileNum = mobileNum;
		this.email = email;
		this.docUpload = docUpload;
		KYCStatus = kYCStatus;
	}

	public String getRefID() {
		return refID;
	}

	public void setRefID(String refID) {
		this.refID = refID;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocUpload() {
		return docUpload;
	}

	public void setDocUpload(String docUpload) {
		this.docUpload = docUpload;
	}

	public String getKYCStatus() {
		return KYCStatus;
	}

	public void setKYCStatus(String kYCStatus) {
		KYCStatus = kYCStatus;
	}
	
	
	


}
