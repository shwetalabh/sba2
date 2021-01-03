package com.wellsfargo.batch7.ibs.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ibs_bank")
public class Bank extends IbsUser {
	
	@Column(name="refID")
	@GeneratedValue
	private String referenceId;
	
	@OneToOne
	@JoinColumn(name="cid")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name="spid")
	private ServiceProvider serviceProvider;
	
	@Column(name="docUpload",nullable=false)
	private boolean documentUpload;
	
	@Column(name="kyc",nullable=false )
	private boolean kycStatus;

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public boolean isDocumentUpload() {
		return documentUpload;
	}

	public void setDocumentUpload(boolean documentUpload) {
		this.documentUpload = documentUpload;
	}

	public boolean isKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(boolean kycStatus) {
		this.kycStatus = kycStatus;
	}
	
	public Bank() {
		
	}
	public Bank(String referenceId, Customer customer, ServiceProvider serviceProvider, boolean documentUpload,
			boolean kycStatus) {
		super();
		this.referenceId = referenceId;
		this.customer = customer;
		this.serviceProvider = serviceProvider;
		this.documentUpload = documentUpload;
		this.kycStatus = kycStatus;
	}
	



}
