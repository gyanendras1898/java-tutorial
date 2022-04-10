package com.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
	
	@Getter
	@Setter
	private int rollNo;
	private String name;
	private String standard;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
//		result = prime * result + ((standard == null) ? 0 : standard.hashCode());
		return result;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (rollNo != other.rollNo)
//			return false;
//		if (standard == null) {
//			if (other.standard != null)
//				return false;
//		} else if (!standard.equals(other.standard))
//			return false;
//		return true;
//	}
	@Override
	public boolean equals(Object obj) {
		Student other=(Student)obj;
		if(this.rollNo==other.rollNo && this.name.equals(other.name))
			return true;
		
		return false;
	}
	
	
	
	

}
