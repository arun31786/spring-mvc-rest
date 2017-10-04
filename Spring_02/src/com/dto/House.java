package com.dto;

public class House {
	private String address;
	private Kitchen kitchen;
	
	
	public House(Kitchen kitchen) {
		super();
		this.kitchen = kitchen;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "House [address=" + address + ", kitchen=" + kitchen + "]";
	}
	
	
	
}
