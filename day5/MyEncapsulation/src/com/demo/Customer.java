package com.demo;

public class Customer {
	private String name;
	private final String userId;
	private String pin;
	private double balance;
	
	public Customer(String name, String userId, String pin, double balance) {
		super();
		this.name = name;
		this.userId = userId;
		this.pin = pin;
		this.balance = balance;
	}
	
	public void deposit(double balance) {
		this.balance+=balance;
	}
	
	public void getbalance(String userId, String pin) {
		
		if(userId.equals(this.userId) && pin.equals(this.pin))
			System.out.println("balance is: "+balance);
		
		else
			System.out.println("Invalid credentials");
	}
	
	public String getName() {
		return this.name;
	}

}
