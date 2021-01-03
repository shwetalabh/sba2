package com.wellsfargo.batch7.ibs.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="ibs_accounts")
public class Account {
	
	@Id
	@Column(name="acno")
	private String accountNum;
	
	@Column(name="accType",nullable=false)
	private String accountType;
	
	@Column(name="amtDepoist")
	private Double amountDeposit;
	
	@Column(name="intRate")
	private Double interestRate;
	
	@Column(name="depositDate")
	private Date depositDate;
	
	@Column(name="matutityDate")
	private Date maturityDate;
	
	@Column(name="intReceived")
	private Double interestReceived;
	
	@Column(name="timeInYrs")
	private Double timeInYears;
	
	@Column(name="timeInMnth")
	private Double timeInMonths;
	
	@Column(name="maturityAmt")
	private Double maturityAmount;
	
	@Column(name="balAmt")
	private Double balanceAmt;
	
	@OneToOne
	@JoinColumn(name="uid")
	private Customer accountHolder;
	
	
	public Account() {
		
	}

	public Account(String accountNum, String accountType, Double amountDeposit, Double interestRate,
			Date depositDate, Date maturityDate, Double interestReceived, Double timeInYears,
			Double timeInMonths, Double maturityAmount, Double balanceAmt, Customer accountHolder) {
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
		this.accountHolder = accountHolder;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
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

	public Date getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
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

	public Customer getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}


	

	
}
