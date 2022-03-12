package com.demo;

public class MathFun {
//	private int a;
//	private int b;
	
	int add(int a, int b) {
		System.out.println("add int");
		return a+b;
	}
	
	double add(double a, double b) {
		System.out.println("add double");
		return a+b;
	}
	
//	double add(double a, double b) {
//		System.out.println("add double");
//		return a+b;
//	}
	
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	int add(int a) {
		return a;
	}

}
