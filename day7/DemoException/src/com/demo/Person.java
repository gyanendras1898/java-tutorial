package com.demo;

public class Person {
	String name;
	int age;
	
	private Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public static Person createObject(String name, int age) {
		return new Person(name,age);
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.age;
	}
	
	
}
