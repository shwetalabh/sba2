package com.wellsfargo.batch7.sbwibs.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class FundTransferModel {
	
	@NotNull(message="Beneficiary Account Number is mandatory")	
	private Long beneficiaryAccNum;
	
	@NotNull(message="Beneficiary Name is mandatory")
	@NotBlank(message="Beneficiary name can not be null")
	private String beneficiaryName;
	
	@NotNull(message="Bank IFSC Code is mandatory")
	@NotBlank(message="Bank IFSC Code can not be null")
	private String ifscCode;
	
	private Double amtTransfer;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate transactionDate;

	private AccountModel account;
	
	
	public FundTransferModel() {
		
	}


	public FundTransferModel(
			Long beneficiaryAccNum,String beneficiaryName,String ifscCode,
			Double amtTransfer, LocalDate transactionDate, AccountModel account) {
		super();
		this.beneficiaryAccNum = beneficiaryAccNum;
		this.beneficiaryName = beneficiaryName;
		this.ifscCode = ifscCode;
		this.amtTransfer = amtTransfer;
		this.transactionDate = transactionDate;
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


	public AccountModel getAccount() {
		return account;
	}


	public void setAccount(AccountModel account) {
		this.account = account;
	}

	
	
	

}
