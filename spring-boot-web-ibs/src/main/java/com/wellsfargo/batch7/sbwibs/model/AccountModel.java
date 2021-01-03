package com.wellsfargo.batch7.sbwibs.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class AccountModel {
	
	private Long accountNum;
	
	private String accountType;
	
	private Double amountDeposit;
	private Double interestRate;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate depositDate;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate maturityDate;
	
	private Double interestReceived;
	private Double timeInYears;
	private Double timeInMonths;
	private Double maturityAmount;
	private Double balanceAmt;
	private CustomerModel customer;
	
	public AccountModel() {
		
	}

	public AccountModel(Long accountNum, String accountType, Double amountDeposit, Double interestRate,
			LocalDate depositDate, LocalDate maturityDate, Double interestReceived, Double timeInYears,
			Double timeInMonths, Double maturityAmount, Double balanceAmt,CustomerModel customer) {
		super();
		this.accountNum = accountNum;
		this.accountType = accountType;
		this.amountDeposit = amountDeposit;
		this.interestRate = interestRate;
		this.depositDate = depositDate;
		this.maturityDate = maturityDate;
		this.interestReceived = interestReceived;
		this.timeInYears = timeInYears;
		this.timeInMonths = timeInMonths;
		this.maturityAmount = maturityAmount;
		this.balanceAmt = balanceAmt;
		this.customer=customer;
	}

	public Long getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getAmountDeposit() {
		return amountDeposit;
	}

	public void setAmountDeposit(Double amountDeposit) {
		this.amountDeposit = amountDeposit;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public LocalDate getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(LocalDate depositDate) {
		this.depositDate = depositDate;
	}

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Double getInterestReceived() {
		return interestReceived;
	}

	public void setInterestReceived(Double interestReceived) {
		this.interestReceived = interestReceived;
	}

	public Double getTimeInYears() {
		return timeInYears;
	}

	public void setTimeInYears(Double timeInYears) {
		this.timeInYears = timeInYears;
	}

	public Double getTimeInMonths() {
		return timeInMonths;
	}

	public void setTimeInMonths(Double timeInMonths) {
		this.timeInMonths = timeInMonths;
	}

	public Double getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(Double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public Double getBalanceAmt() {
		return balanceAmt;
	}

	public void setBalanceAmt(Double balanceAmt) {
		this.balanceAmt = balanceAmt;
	}

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	
}
