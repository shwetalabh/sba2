package com.wellsfargo.batc7.ibsma.model;



public class Customer {
	
	private String customerName;
	
	private String password;

	private String dateOfBirth;

	private String phoneNumber;

	private String address;
	
	private String emailId;
	
	public Customer() {
		
	}

	public Customer(String customerName, String password, String dateOfBirth, String phoneNumber, String address,
			String emailId) {
		super();
		this.customerName = customerName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.emailId = emailId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
}
