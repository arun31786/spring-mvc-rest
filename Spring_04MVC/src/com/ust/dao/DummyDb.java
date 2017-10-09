package com.ust.dao;

import java.util.HashMap;
import java.util.Map;

import com.ust.entity.User;

public class DummyDb {

	static Map<String, User> map = new HashMap();
	public DummyDb(){
		User user = new User();
		user.setName("arun");
		user.setPwd("arun");
		user.setEmail("arun@gmail.com");
		user.setAge(32);
		user.setGender("male");
		map.put(user.getName(), user);
	}
	
	public static boolean isRegistered(User user){
		boolean isRegistered = false;
		String name = user.getName();
		if(!"".equals(name.trim()) && name.trim().length()>0){
			map.put(name, user);
			isRegistered = true;
		}
		return isRegistered;
	}
	
	public static boolean isLoggedIn(User user){
		boolean isFound = false;
		User dbUser = map.get(user.getName());
		if(dbUser != null && dbUser.getPwd().equals(user.getPwd())){
			isFound = true;
		}
		return isFound;
	}
}
