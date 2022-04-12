package com.piyush.persistence;

import java.util.ArrayList;

import com.piyush.beans.Course;
import com.piyush.beans.Employee;

public interface CourseDao {
	
	/*Course[]*/ ArrayList<Course> getAllCourses();
	Course searchCourseById(String cId);
	boolean addEmployeeForCourseId(String cID,Employee employee);
	boolean removeEmployeeCourseId(String cID, Employee employee);

}
