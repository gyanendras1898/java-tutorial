package com.piyush.database;

import java.util.ArrayList;

import com.piyush.beans.Course;
import com.piyush.beans.Employee;

public class CourseDataBase {

//	private static Course[] courses=new Course[5];
	private static ArrayList<Course> courses=new ArrayList<>();

//	static {
//		courses[0]=new Course("C001", "JAVA", 20000, true, true, 0, new Employee[10]);
//		courses[1]=new Course("C002", "Spring", 30000, true, false, 0, new Employee[10]);
//		courses[2]=new Course("C003", "Hibernate", 25000, true, false, 0, new Employee[10]);
//		courses[3]=new Course("C004", "React JS", 40000, true, true, 0, new Employee[10]);
//		courses[4]=new Course("C005", "Angular JS", 50000, true, true, 0, new Employee[10]);
//		
//	}
	
	static {
		courses.add(new Course("C001", "JAVA", 20000, true, true, new ArrayList<>()));
		courses.add(new Course("C002", "Spring", 30000, true, false, new ArrayList<>()));
		courses.add(new Course("C003", "Hibernate", 25000, true, false, new ArrayList<>()));
		courses.add(new Course("C004", "React JS", 40000, true, true, new ArrayList<>()));
		courses.add(new Course("C005", "Angular JS", 50000, true, true, new ArrayList<>()));	
		
	}
	public static /*Course[]*/ ArrayList<Course> getCourses() {
		return courses;
	}

	public static void setCourses(/*Course[]*/ ArrayList<Course> courses) {
		CourseDataBase.courses = courses;
	}
	
}
