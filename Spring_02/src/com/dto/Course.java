package com.dto;

import java.util.List;
import java.util.Set;

public class Course {
	int admissionYear;
	double fee;
//	List<String> subjects;
//	List<Person> yellowPages;
	Set<String> subjects;
//	Map<String> subjects;

	public Course() { }
	
	public Course(int admissionYear, double fee) {
		super();
		this.admissionYear = admissionYear;
		this.fee = fee;
	}
	
	public int getAdmissionYear() {
		return admissionYear;
	}
	public void setAdmissionYear(int admissionYear) {
		this.admissionYear = admissionYear;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
//	public List<String> getSubjects() {
//		return subjects;
//	}
//	public void setSubjects(List<String> subjects) {
//		this.subjects = subjects;
//	}
	
	
	@Override
	public String toString() {
		return "Course [admissionYear=" + admissionYear + ", fee=" + fee
				+ ", subjects=" + subjects + "]";
	}

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	
}
