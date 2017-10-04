package com.dto;

public class Kitchen {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Kitchen [type=" + type + "]";
	}
		
}
