package com.wellsfargo.batch7.IBSServiceProvider.dto;

public class ServiceProvider {
	
	public String SpID;
	protected String SpAccountNumber;


public ServiceProvider()
{
	
}


public ServiceProvider(String spID, String spAccountNumber) {
	super();
	SpID = spID;
	SpAccountNumber = spAccountNumber;
}


public String getSpID() {
	return SpID;
}


public void setSpID(String spID) {
	SpID = spID;
}


public String getSpAccountNumber() {
	return SpAccountNumber;
}


public void setSpAccountNumber(String spAccountNumber) {
	SpAccountNumber = spAccountNumber;
}



}