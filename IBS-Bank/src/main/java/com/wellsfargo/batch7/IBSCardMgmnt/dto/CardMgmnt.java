package com.wellsfargo.batch7.IBSCardMgmnt.dto;

import java.util.Date;

import com.wellsfargo.batch7.IBSCustomer.dto.Customer;

public class CardMgmnt extends Customer{

	protected String card;
	protected String cardNum;
	protected String cardType;
	protected Date expiryDt;
	protected Double cardLimit;
	protected String customerID;
	protected Boolean active;
	
	
	public CardMgmnt() {
		
	}
	
	public boolean updatecard(){
		return true;
	}
	
	public String generateCardStatement() {
		return null;
	}

	public CardMgmnt(String card, String cardNum, String cardType, Date expiryDt, Double cardLimit, String customerID,
			Boolean active) {
		super();
		this.card = card;
		this.cardNum = cardNum;
		this.cardType = cardType;
		this.expiryDt = expiryDt;
		this.cardLimit = cardLimit;
		this.customerID = customerID;
		this.active = active;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
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

	public Date getExpiryDt() {
		return expiryDt;
	}

	public void setExpiryDt(Date expiryDt) {
		this.expiryDt = expiryDt;
	}

	public Double getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(Double cardLimit) {
		this.cardLimit = cardLimit;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
}
