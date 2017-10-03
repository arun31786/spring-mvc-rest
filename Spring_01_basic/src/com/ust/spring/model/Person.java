package com.ust.spring.model;

import java.util.Date;

//public class Person implements InitializingBean, DisposableBean{
public class Person {
	private String name;
	private int age;
	private Date dob;
	
	public Person(){
		System.out.println("Constructing person object");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}

//	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After properties setters: "+this);
	}

//	@Override
	public void destroy() throws Exception {
		System.out.println("Before destroy: "+this);
	}
	
}
