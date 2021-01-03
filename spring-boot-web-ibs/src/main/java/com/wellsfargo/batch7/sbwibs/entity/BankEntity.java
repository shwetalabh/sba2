package com.wellsfargo.batch7.sbwibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ibs_bank_main")
@Inheritance(strategy=InheritanceType.JOINED)

public class BankEntity {
	@Id
	@Column(name="refID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="Refid_generator")
	@SequenceGenerator(name="Refid_generator", sequenceName="RefId_seq",allocationSize=1,initialValue=10)
	private Long refId;
	
	@Column(name="unm",nullable=false,unique=true)
	private String userName;
	
	@Column(name="kyc_status",nullable=false)
	private String kycStatus;

	public BankEntity(Long refId, String userName, String kycStatus) {
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
