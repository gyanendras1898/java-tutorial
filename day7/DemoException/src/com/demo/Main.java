package com.demo;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		Student piyush=new Student(01,"Piyush","VI-C");
		Student anamika=new Student(02,"Anamika","V-C");
		Student aman=new Student(03,"Aman","VI-C");
		Student preeti=new Student(02,"Anamika","V-C");
		
		set.add(piyush);
		set.add(aman);
		set.add(preeti);
		set.add(anamika);
		
		for(Student student : set)
			System.out.println(student);
		
		
//		Person.name="Gyanendra";
		
//		System.out.println(Person.name);
		
		Person piyushSingh=Person.createObject("Piyush", 23);
		Person anamikaSingh=Person.createObject("Anamika", 23);
		
		
		
//		System.out.println(Person.name);
//		
//		Person.name="gyanendra";
		
		System.out.println(piyushSingh);
		System.out.println(anamikaSingh);
		
//		System.out.println(anamika.equals(preeti));
		
	}

}
