package com.wellsfargo.batch7.IBSLoanMgmnt.dto;

import com.wellsfargo.batch7.IBSCustomer.dto.Customer;

public class LoanMgmnt extends Customer {
	
	protected String loanAccNum;
	protected String loanAccType;
	protected String loanType;
	protected Double interestRate;
	protected Integer loanTenure;
	protected Integer loanEMI;
	protected String customerID;
	
	public LoanMgmnt() {
		
	}
	public String applyLoan() {
		return loanAccNum;
		
	}
	
	public Integer payLoanEMI() {
		return loanEMI;
		
	}
	
	public String loanStatement() {
		return null;
		
	}
	
	public String requestPreClosure() {
		return null;
	}

	public LoanMgmnt(String loanAccNum, String loanAccType, String loanType, Double interestRate, Integer loanTenure,
			Integer loanEMI, String customerID) {
		super();
		this.loanAccNum = loanAccNum;
		this.loanAccType = loanAccType;
		this.loanType = loanType;
		this.interestRate = interestRate;
		this.loanTenure = loanTenure;
		this.loanEMI = loanEMI;
		this.customerID = customerID;
	}

	public String getLoanAccNum() {
		return loanAccNum;
	}

	public void setLoanAccNum(String loanAccNum) {
		this.loanAccNum = loanAccNum;
	}

	public String getLoanAccType() {
		return loanAccType;
	}

	public void setLoanAccType(String loanAccType) {
		this.loanAccType = loanAccType;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Integer getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(Integer loanTenure) {
		this.loanTenure = loanTenure;
	}

	public Integer getLoanEMI() {
		return loanEMI;
	}

	public void setLoanEMI(Integer loanEMI) {
		this.loanEMI = loanEMI;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	


}
