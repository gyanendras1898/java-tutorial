package com.demo;

public class Main {
	public static void main(String[] args) {
		Customer cus=new Customer("Piyush", "12345", "0000", 200);

		cus.getbalance("12345" , "0000");
		
		System.out.println(cus.getName());
	}

}
