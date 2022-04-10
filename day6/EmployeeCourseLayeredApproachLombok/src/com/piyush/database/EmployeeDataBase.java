package com.piyush.database;

import java.util.ArrayList;

import com.piyush.beans.Employee;

public class EmployeeDataBase {
//	private static Employee[] employees=new Employee[5];
	private static ArrayList<Employee> employees=new ArrayList<>();
//	static {
//		employees[0]=new Employee(101, "Akash", "IT", "Sr. Manager", 250000);
//		employees[1]=new Employee(102, "Bharat", "IT", "Associate", 100000);
//		employees[2]=new Employee(103, "Charu", "IT", "Sr. Associate", 120000);
//		employees[3]=new Employee(104, "Disha", "IT", "Executive", 50000);
//		employees[4]=new Employee(105, "Esha", "IT", "Team Lead", 150000);
//	}
	
	static {
		employees.add(new Employee(101, "Akash", "IT", "Sr. Manager", 250000));
		employees.add(new Employee(102, "Bharat", "IT", "Associate", 100000));
		employees.add(new Employee(103, "Charu", "IT", "Sr. Associate", 120000));
		employees.add(new Employee(104, "Disha", "IT", "Executive", 50000));
		employees.add(new Employee(105, "Esha", "IT", "Team Lead", 150000));
	}
	public static /*Employee[]*/ ArrayList<Employee> getEmployees() {
		return employees;
	}
	public static void setEmployees(/*Employee[]*/ ArrayList<Employee> employees) {
		EmployeeDataBase.employees = employees;
	}
	
	

}
