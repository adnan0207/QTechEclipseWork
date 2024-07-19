package com.adnan.differntuseofclasses;

// we could make a main class for main method to run our program and use services

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Adnan");
		
		Calculator obj = new Calculator();
		int sum = obj.add(10, 20);
		System.out.println("Using sum method of Calculator class : " + sum);
		
		BankingServices obj2 = new BankingServices();
		obj2.FundTransfer(566558, 754245, 1000, 1234);
	}
}
