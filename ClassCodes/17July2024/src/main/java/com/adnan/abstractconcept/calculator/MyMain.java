package com.adnan.abstractconcept.calculator;

public class MyMain {

	public static void main(String[] args) {

		CalculatorImplementation2 obj = new CalculatorImplementation2();
		
		System.out.println(obj.add(2, 5));
		System.out.println(obj.sub(12, 5));
		System.out.println(obj.mul(20, 15));
		System.out.println(obj.div(20, 5));

	}
}
