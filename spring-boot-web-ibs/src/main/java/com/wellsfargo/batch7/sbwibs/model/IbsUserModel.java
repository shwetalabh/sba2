package com.wellsfargo.batch7.sbwibs.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;



public class IbsUserModel {

	/*@NotNull(message="User ID is mandatory")*/
	private Long userId;
	
	/*@NotNull(message="User Name is mandatory")
	@NotBlank(message="User name can not be null")*/
	private String userName;
	
	/*@NotNull(message="Password is mandatory")
	@NotBlank(message="Password can not be null")
	@Size(min=4,max=50,message="Password must be 4 to 50 chars in length")*/
	private String password;
	
	/*@NotNull(message="Password is mandatory")
	@NotBlank(message="Password can not be null")
	@Size(min=4,max=50,message="Password must be 4 to 50 chars in length")*/
	private String confirmPassword;
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	private String role;

	public IbsUserModel() {
		
	}

	public IbsUserModel(Long userId, String userName, String password, String role) {
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
