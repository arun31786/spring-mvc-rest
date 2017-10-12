package com.ust.service;

import com.ust.dao.LoginDao;
import com.ust.dto.User;

public class LoginService {
	LoginDao loginDao;
	public LoginService(){ }
	public LoginService(LoginDao loginDao){ 
		this.loginDao = loginDao;
	}
	public User getLogin(User user){
		return this.loginDao.getLogin(user);
	}
}
