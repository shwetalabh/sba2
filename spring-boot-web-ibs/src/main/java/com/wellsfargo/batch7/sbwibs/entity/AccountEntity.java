package com.wellsfargo.batch7.sbwibs.entity;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ibs_accounts")
public class AccountEntity implements Comparable<AccountEntity> {

	
	@Id
	@GeneratedValue
	@Column(name="acno")
	private Long accountNum;
	
	@Column(name="accType")
	private String accountType;
	
	@Column(name="amtDepoist")
	private Double amountDeposit;
	
	@Column(name="intRate")
	private Double interestRate;
	
	@Column(name="depositDate")
	private LocalDate depositDate;
	
	@Column(name="matutityDate")
	private LocalDate maturityDate;
	
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
	
	@ManyToOne
	@JoinColumn(name="uid")
	private CustomerEntity customer;
	
	@OneToMany(mappedBy="account",cascade=CascadeType.ALL)
	private Set<FundTransferEntity> beneficiaries;
	
	
	public AccountEntity() {
		
	}

	public AccountEntity(Long accountNum, String accountType, Double amountDeposit, Double interestRate,
			LocalDate depositDate, LocalDate maturityDate, Double interestReceived, Double timeInYears,
			Double timeInMonths, Double maturityAmount, Double balanceAmt ,CustomerEntity customer) {
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

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	@Override
	public int compareTo(AccountEntity o) {
		return this.accountNum.compareTo(o.accountNum);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.accountNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		return Objects.equals(this, obj);
	}

	

	
}
