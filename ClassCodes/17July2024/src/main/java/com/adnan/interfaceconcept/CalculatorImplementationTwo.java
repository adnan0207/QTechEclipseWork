package com.adnan.interfaceconcept;

public class CalculatorImplementationTwo extends CalculatorImplementation{

	public int div(int x, int y) {
		System.out.println("This Div service is developed by " + CalculatorInterface.name);
		return x / y;
	}

}
