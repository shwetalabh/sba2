package com.wellsfargo.batch7.ibs.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ibs_service_provider")
@Inheritance(strategy=InheritanceType.JOINED)
public class ServiceProvider extends IbsUser {

	@Column(name = "sid")
	private String spId;

	@Column(name = "spAccNo")
	private String spAccountNo;

	@Column(name = "spName")
	private String spName;
	
	@OneToOne(mappedBy="serviceProvider",cascade=CascadeType.ALL)
	private Bank savAccount;
	
	public ServiceProvider() {

	}

	public ServiceProvider(String spId, String spAccountNo, String spName) {
		super();
		this.spId = spId;
		this.spAccountNo = spAccountNo;
		this.spName = spName;
	}

	public String getSpId() {
		return spId;
	}

	public void setSpId(String spId) {
		this.spId = spId;
	}

	public String getSpAccountNo() {
		return spAccountNo;
	}

	public void setSpAccountNo(String spAccountNo) {
		this.spAccountNo = spAccountNo;
	}

	public String getSpName() {
		return spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	
}
