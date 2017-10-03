package com.ust.spring.model;

public class Student {

	private String name;
	private int age;

	/*public Student() {
		System.out.println("default const");
	}*/
	
	public Student(String name, int age) {
		super();
		System.out.println("Constructing name");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	
	
}
