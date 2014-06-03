package com.webauth.app;

public class UserInfo {
	public String userName;
	public String password;
	public UserInfo(String user, String password){
		this.userName  = user;
		this.password = password;
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
}
