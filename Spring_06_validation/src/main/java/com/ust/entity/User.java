package com.ust.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

public class User {
	@Size(min=3, max=10, message="Your name should be b/w 3-10 characters.")
	private String name;
	@Size(min=3, max=10, message="Your name should be b/w 3-10 characters.")
	private String lastname;
	@NotNull(message="Please type some password")
	@Length(min=5, max=8, message="Password should be b/w 5-8 characters")
	private String password;
	@Pattern(regexp="[0-9]+", message="Wrong Zip, only numbers are valid")
	private String zip;

	private String email;
	
	@Min(value=18, message="Min age is 18")
	@Max(value=62, message="Max age is 62")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", lastname=" + lastname + ", password="
				+ password + ", zip=" + zip + ", email=" + email + ", age="
				+ age + "]";
	}
	
	
}
