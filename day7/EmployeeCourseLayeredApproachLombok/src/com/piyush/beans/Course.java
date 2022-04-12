package com.piyush.beans;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Course {

	@Getter
	@Setter
	private String courseId;
	
	@Getter
	@Setter
	private String courseName;
	
	@Getter
	@Setter
	private int courseFee;
	
	@Getter
	@Setter
	private boolean online;
	
	@Getter
	@Setter
	private boolean fullTime;

	@Getter
	@Setter
	private /*Employee[]*/ ArrayList<Employee> employees=new ArrayList<>();
	
	
}
