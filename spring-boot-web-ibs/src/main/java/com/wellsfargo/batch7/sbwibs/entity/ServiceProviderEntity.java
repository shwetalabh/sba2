package com.wellsfargo.batch7.sbwibs.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ibs_serviceprovider")
@Inheritance(strategy = InheritanceType.JOINED)
public class ServiceProviderEntity extends IbsUserEntity {

	@Column(name = "spname", nullable = false)
	private String customerName;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "dob", nullable = false)
	private LocalDate dateOfBirth;

	@Column(name = "phone", nullable = false, unique = true)
	private String phoneNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "email", nullable = false, unique = true)
	private String emailId;

	@Column(name = "regStatus")
	private String registrationStatus;

	@Column(name = "accNumber")
	private String accountNumber;

	@Column(name = "ifscCode")
	private String ifscCode;

	public ServiceProviderEntity() {

	}

	public ServiceProviderEntity(String spName, String gender, LocalDate dateOfBirth, String phoneNumber,
			String address, String emailId, String registrationStatus, String accountNumber, String ifscCode) {
		super();
		this.customerName = spName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.emailId = emailId;
		this.registrationStatus = registrationStatus;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
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

}
