package com.wellsfargo.batch7.sbwibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ibs_user_main")
@Inheritance(strategy=InheritanceType.JOINED)
public class IbsUserEntity {

	@Id
	@Column(name="uid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="Custid_generator")
	@SequenceGenerator(name="Custid_generator", sequenceName="CustId_seq",allocationSize=1,initialValue=1000000000)
	private Long userId;
	
	@Column(name="unm",nullable=false,unique=true)
	private String userName;
	
	@Column(name="pwd",nullable=false)
	private String password;
	
	@Column(name="role",nullable=false)
	private String role;

	public IbsUserEntity() {
		
	}

	public IbsUserEntity(Long userId, String userName, String password, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
