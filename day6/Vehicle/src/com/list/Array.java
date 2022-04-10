package com.list;

public class Array<T> {
	private T arr[];
	private int size;
	
	
	public Array() {
		super();
		arr=(T[]) new Object[5];
		
		size=0;
	}
	
	void add(T data) {
		arr[size]=data;
		size++;
	}
	
	
	
	void printArray() {
		for(T ele: arr) {
			System.out.println(ele+" ");
		}
	}
	
	

}
