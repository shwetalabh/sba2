package com.wellsfargo.batch7.sbwibs.model;


import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class CustomerModel extends IbsUserModel {
	
	@NotNull(message="Customer Name is mandatory")
	@NotBlank(message="Customer name can not be null")
	private String customerName;
	
	@NotNull(message="DoB is mandatory")
	@DateTimeFormat(iso=ISO.DATE)
	@Past(message="DoB should be a past Date")
	private LocalDate dateOfBirth;
	
	@NotNull(message="Gender is mandatory")
	@NotBlank(message="Gender can not be null")
	private String gender;
	
	@NotNull(message="Phone num is mandatory")
	@NotBlank(message="Phone num can not be null")
	@Pattern(regexp = "[1-9][0-9]{9}",message = "Mobile number must be exactly ten digits")
	private String phoneNumber;
	
	@NotNull(message="Address is mandatory")
	@NotBlank(message="Address can not be null")
	private String address;
	
	@NotNull(message="Email ID is mandatory")
	@NotBlank(message="Email ID can not be null")
	@Email(message = "Email Id is not valid")
	private String emailId;

	private String registrationStatus;
	
	private String txnPassword;
	
	private AccountModel account;
	
	/*
	 * private List<AccountModel> ac;
	 * 
	 * public List<AccountModel> getAc() { return ac; }
	 * 
	 * public void setAc(List<AccountModel> ac) { this.ac = ac; }
	 */

	public CustomerModel() {
		
	}	

	public CustomerModel(String customerName, LocalDate dateOfBirth, String gender,String phoneNumber, String address, String emailId,
			String txnPassword,String registrationStatus) {
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.emailId = emailId;
		this.txnPassword = txnPassword;
		this.gender=gender;
		this.registrationStatus=registrationStatus;
	}

	
	public String getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		
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

	public String getTxnPassword() {
		return txnPassword;
	}

	public void setTxnPassword(String txnPassword) {
		this.txnPassword = txnPassword;
	}
	public AccountModel getAccount() {
		return account;
	}

	public void setAccount(AccountModel account) {
		this.account = account;
	}
	
}