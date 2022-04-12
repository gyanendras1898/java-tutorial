package com.piyush.service;

import java.util.ArrayList;

import com.piyush.beans.Course;
import com.piyush.beans.Employee;

public interface CourseService {

	/*Course[]*/ ArrayList<Course> getAllCoursesForEmployee();
	boolean registerEmployeeForCourse(String cId,Employee employee);
	boolean deregisterEmployeeForCourse(String cID,Employee employee);
	/*Employee[]*/ ArrayList<Employee> listOfEmployeesForCourse(String cID);
}
