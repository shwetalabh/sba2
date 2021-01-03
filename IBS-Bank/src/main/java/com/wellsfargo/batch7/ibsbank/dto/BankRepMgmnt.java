package com.wellsfargo.batch7.ibsbank.dto;

public class BankRepMgmnt {

	protected String repID;
	protected String customerID;
	protected String accountNum;
	protected String cardNum;
	protected String cardType;
	protected String loanType;
	protected String loanAccNum;
	
	public BankRepMgmnt() {
		
	}
	
	

	@Override
	public String toString() {
		return "BankRepMgmnt [repID=" + repID + "]";
	}



	public BankRepMgmnt(String repID, String customerID, String accountNum, String cardNum, String cardType,
			String loanType, String loanAccNum) {
		super();
		this.repID = repID;
		this.customerID = customerID;
		this.accountNum = accountNum;
		this.cardNum = cardNum;
		this.cardType = cardType;
		this.loanType = loanType;
		this.loanAccNum = loanAccNum;
	}

	public String getRepID() {
		return repID;
	}

	public void setRepID(String repID) {
		this.repID = repID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanAccNum() {
		return loanAccNum;
	}

	public void setLoanAccNum(String loanAccNum) {
		this.loanAccNum = loanAccNum;
	}
	
	

}
