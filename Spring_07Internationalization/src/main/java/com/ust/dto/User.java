package com.ust.dto;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class User {
	String userid;
	String password;
	boolean loggedIn;
	
	@Autowired
	private MessageSource messageSource;
	
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password
				+ ", loggedIn=" + loggedIn + "]";
	}
	public void showStatus(Locale locale){
		String message = null;
		if(loggedIn){
//			System.out.println("valid "+this);
			message = this.messageSource.getMessage("app.valid", new Object[]{this.getUserid()}, "Hello "+this.getUserid(), locale);
		} else {
//			System.out.println("invalid "+this);
			message = this.messageSource.getMessage("app.invalid", null, "Invalid details", locale);
		}
		System.out.println(message);
	}


}
