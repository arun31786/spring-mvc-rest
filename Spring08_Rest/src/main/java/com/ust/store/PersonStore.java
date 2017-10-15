package com.ust.store;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ust.entity.Person;

public class PersonStore {
	private Map<Integer, Person> personMap = new HashMap<Integer, Person>();
	private static int idCounter = 0;
	public PersonStore(){
		this.personMap.put(1, new Person(1, "Mark", new Date()));
		this.personMap.put(2, new Person(2, "Carl", new Date()));
		this.personMap.put(3, new Person(3, "Miley", new Date()));
		this.personMap.put(4, new Person(4, "Emiley", new Date()));
	}
	public Map<Integer, Person> getPersonMap() {
		return personMap;
	}
	@Override
	public String toString() {
		return "PersonStore [personMap=" + personMap + ", idCounter="
				+ idCounter + "]";
	}
	
}
