package com.wellsfargo.batch7.sbwibs.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BankModel {
	
	private Long refId;
	
	@NotNull(message="User Name is mandatory")
	@NotBlank(message="User name can not be null")
	private String userName;
	
	
	@NotNull(message="KYC Status is mandatory")
	@NotBlank(message="KYC Status can not be null")
	private String kycStatus;


	public BankModel(Long refId,String userName,String kycStatus) {
		super();
		this.refId = refId;
		this.userName = userName;
		this.kycStatus = kycStatus;
	}


	public Long getRefId() {
		return refId;
	}


	public void setRefId(Long refId) {
		this.refId = refId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getKycStatus() {
		return kycStatus;
	}


	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}
	
	
	

}
