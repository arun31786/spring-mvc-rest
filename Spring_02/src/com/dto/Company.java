package com.dto;

public class Company {
	String address;
	Employee emp;
	
	public Company() { }
	
	public Company(Employee emp) {
		this.emp = emp;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [address=" + address + ", emp=" + emp + "]";
	}
		
}
