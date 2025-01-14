package com.adnan.interfaceconcept;

public interface CalculatorInterface {
	
	public static final String name = "Adnan";

	abstract public int add(int x, int y);
	abstract public int sub(int x, int y);
	public int mul(int x, int y);		// even if we don't use abstract keyword no problem
	public int div(int x, int y); 		// compiler will add abstract keyword by itself 
	
}
