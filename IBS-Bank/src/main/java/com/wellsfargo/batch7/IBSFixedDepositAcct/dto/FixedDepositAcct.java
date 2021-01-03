package com.wellsfargo.batch7.IBSFixedDepositAcct.dto;

import com.wellsfargo.batch7.IBSAccount.dto.IAccount;

public class FixedDepositAcct implements IAccount{
	
	protected String accSartDate;
	protected String depositDate;
	protected Double amntDeposit;
	protected Double amntDebited;
	protected String accNumber;
	protected String balanceAmnt;
	protected Integer transasctionID;
	
	@Override
	public String getAccountInfo() {
		return null;	
	}
	
	@Override
	public String Statements() {
		return null;
		
	}
	
	@Override
	public String BalanceCheck() {
		return null;
		
	}

	public FixedDepositAcct(String accSartDate, String depositDate, Double amntDeposit, Double amntDebited,
			String accNumber, String balanceAmnt, Integer transasctionID) {
		super();
		this.accSartDate = accSartDate;
		this.depositDate = depositDate;
		this.amntDeposit = amntDeposit;
		this.amntDebited = amntDebited;
		this.accNumber = accNumber;
		this.balanceAmnt = balanceAmnt;
		this.transasctionID = transasctionID;
	}

	public String getAccSartDate() {
		return accSartDate;
	}

	public void setAccSartDate(String accSartDate) {
		this.accSartDate = accSartDate;
	}

	public String getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(String depositDate) {
		this.depositDate = depositDate;
	}

	public Double getAmntDeposit() {
		return amntDeposit;
	}

	public void setAmntDeposit(Double amntDeposit) {
		this.amntDeposit = amntDeposit;
	}

	public Double getAmntDebited() {
		return amntDebited;
	}

	public void setAmntDebited(Double amntDebited) {
		this.amntDebited = amntDebited;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getBalanceAmnt() {
		return balanceAmnt;
	}

	public void setBalanceAmnt(String balanceAmnt) {
		this.balanceAmnt = balanceAmnt;
	}

	public Integer getTransasctionID() {
		return transasctionID;
	}

	public void setTransasctionID(Integer transasctionID) {
		this.transasctionID = transasctionID;
	}

	

}
