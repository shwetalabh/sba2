package com.wellsfargo.batch7.sbwibs.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ibs_fund_transaction")
public class FundTransactionEntity {
	
	@Id
	@Column(name="txnID")
	@GeneratedValue
	private Integer transactionID;	
	
	@Column(name="amtTransferred")
	private Double amtTransfer;
	
	@Column(name="txnDate")
	private LocalDate transactionDate;
	
	@ManyToOne
	@JoinColumn(name="acno")
	private AccountEntity account;
	
	@ManyToOne
	@JoinColumn(name="benefAccNum")
	private FundTransferEntity beneficiary;
	
	
	public FundTransactionEntity() {
		
	}


	public FundTransactionEntity(Integer transactionID, Double amtTransfer, LocalDate transactionDate,
			AccountEntity account, FundTransferEntity beneficiary) {
		super();
		this.transactionID = transactionID;
		this.amtTransfer = amtTransfer;
		this.transactionDate = transactionDate;
		this.account = account;
		this.beneficiary = beneficiary;
	}


	public Integer getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}


	public Double getAmtTransfer() {
		return amtTransfer;
	}


	public void setAmtTransfer(Double amtTransfer) {
		this.amtTransfer = amtTransfer;
	}


	public LocalDate getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}


	public AccountEntity getAccount() {
		return account;
	}


	public void setAccount(AccountEntity account) {
		this.account = account;
	}


	public FundTransferEntity getBeneficiary() {
		return beneficiary;
	}


	public void setBeneficiary(FundTransferEntity beneficiary) {
		this.beneficiary = beneficiary;
	}


	


	

	

	
	
	

}
