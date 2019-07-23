package com.congthang.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

public class User implements Serializable{
	@NotNull(message = "khong bo trong")
	private int userId;
	@NotNull(message = "khong bo trong")
	private String userName;
	@NotNull(message = "khong bo trong")
	private String passWord;
	@NotNull(message = "khong bo trong")
	@Email
	private String email;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
	}

}
