package com.adnan.interfaceconcept;

abstract public class CalculatorImplementation implements CalculatorInterface {

	public int add(int x, int y) {
		System.out.println("This Add service is developed by " + CalculatorInterface.name);
		return x + y;
	}

	public int sub(int x, int y) {
		System.out.println("This Sub service is developed by " + CalculatorInterface.name);
		return x - y;
	}

	public int mul(int x, int y) {
		System.out.println("This Mul service is developed by " + CalculatorInterface.name);
		return x * y;
	}

}
