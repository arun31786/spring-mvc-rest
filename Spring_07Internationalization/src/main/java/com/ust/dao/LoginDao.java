package com.ust.dao;

import com.ust.dto.User;

public class LoginDao {
	public User getLogin(User user){
		// get user from database
		user.setLoggedIn(user.getUserid().equals(user.getPassword()));
		return user;
	}
}
