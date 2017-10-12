package com.ust.controller;

import com.ust.dto.User;
import com.ust.service.LoginService;

public class LoginController {

	LoginService loginService;
	public LoginController(){}
	public LoginController(LoginService loginService){
		this.loginService = loginService;
	}
	public User getLogin(User user){
		return this.loginService.getLogin(user);
	}
}
