package com.wellsfargo.batch7.sbwibs.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ibs_beneficiary")
public class FundTransferEntity {
	
	@Id
	@Column(name="benefAccNum")
	private Long beneficiaryAccNum;
	
	@Column(name="benefName")
	private String beneficiaryName;
	
	@Column(name="ifsc")
	private String ifscCode;	
	
	@ManyToOne
	@JoinColumn(name="acno")
	private AccountEntity account;
	
	@OneToMany(mappedBy="beneficiary",cascade=CascadeType.ALL)
	private Set<FundTransactionEntity> funds;
	
	
	public FundTransferEntity() {
		
	}


	public FundTransferEntity(
			Long beneficiaryAccNum,String beneficiaryName,String ifscCode,
			AccountEntity account) {
		super();
		this.beneficiaryAccNum = beneficiaryAccNum;
		this.beneficiaryName = beneficiaryName;
		this.ifscCode = ifscCode;
		this.account = account;
	}


	public Long getBeneficiaryAccNum() {
		return beneficiaryAccNum;
	}


	public void setBeneficiaryAccNum(Long beneficiaryAccNum) {
		this.beneficiaryAccNum = beneficiaryAccNum;
	}


	public String getBeneficiaryName() {
		return beneficiaryName;
	}


	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public AccountEntity getAccount() {
		return account;
	}

	public void setAccount(AccountEntity account) {
		this.account = account;
	}


	

	
	
	

}
