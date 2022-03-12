package com.gyan.student;

public class Student {
	private String name;
	private int rollNo;
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	

}
