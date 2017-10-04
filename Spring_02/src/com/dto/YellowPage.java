package com.dto;

import java.util.List;

public class YellowPage {
	List<Person> persons;

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "YellowPage [persons=" + persons + "]";
	}
	
	
}
