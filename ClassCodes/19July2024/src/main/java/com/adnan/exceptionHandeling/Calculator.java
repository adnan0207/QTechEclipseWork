package com.adnan.exceptionHandeling;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		float divResult = obj.divide(10, 0);
		System.out.println("Divide result is : " + divResult);
		
	}
	
	public float divide(int a, int b) {
		float div;
		div(20, 2);
		div = a/b;
		System.out.println("Result is : " + div);
		return div;
	}
	
	public float div(int a, int b) {
		System.out.println("Inside div");
		return a/b;
	}
	
	
}
