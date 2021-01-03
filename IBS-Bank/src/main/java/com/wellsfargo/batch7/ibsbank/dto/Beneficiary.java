package com.wellsfargo.batch7.ibsbank.dto;

public class Beneficiary {
	
	protected String beneficiaryAccNum;
	protected String beneficiaryName;
	
	public Beneficiary() {
		
	}
	
	public String addBeneficiary() {
		return beneficiaryName;
		
	}
	
	public String modifyBeneficiary() {
		return beneficiaryName;		
	}
	
	public String fundTransfer() {
		return null;
		
	}

	public Beneficiary(String beneficiaryAccNum, String beneficiaryName) {
		super();
		this.beneficiaryAccNum = beneficiaryAccNum;
		this.beneficiaryName = beneficiaryName;
	}

	public String getBeneficiaryAccNum() {
		return beneficiaryAccNum;
	}

	public void setBeneficiaryAccNum(String beneficiaryAccNum) {
		this.beneficiaryAccNum = beneficiaryAccNum;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	


}
