package com.wellsfargo.batc7.ibsma.model;

import java.time.LocalDate;

public class Accounts {
	
	private String accountNum;	
	private Double amountDeposit;
	private Double interestRate;
	private LocalDate depositDate;
	private LocalDate maturityDate;
	private Double interestReceived;
	private Double timeInYears;
	private Double timeInMonths;
	private Double maturityAmount;
	
	
	public Accounts() {
		
	}


	public Accounts(String accountNum, Double amountDeposit, Double interestRate, LocalDate depositDate,
			LocalDate maturityDate, Double interestReceived, Double timeInYears, Double timeInMonths,
			Double maturityAmount) {
		super();
		this.accountNum = accountNum;
		this.amountDeposit = amountDeposit;
		this.interestRate = interestRate;
		this.depositDate = depositDate;
		this.maturityDate = maturityDate;
		this.interestReceived = interestReceived;
		this.timeInYears = timeInYears;
		this.timeInMonths = timeInMonths;
		this.maturityAmount = maturityAmount;
	}


	public String getAccountNum() {
		return accountNum;
	}


	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
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


	

	
}
