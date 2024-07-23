package com.adnan.exceptionhandeling;

public class Calculator {

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		int divisor = 10;
		int dividend = 0;
		float divResult = obj.divide(divisor, dividend);
		System.out.println("Divide result is : " + divResult);

	}

	public float divide(int a, int b) {
		float div;
		try {			
			div = a / b;
			return div;
		}catch(ArithmeticException e) {
			String msg = e.getMessage();
			System.out.println(msg);
			StackTraceElement[] trace = e.getStackTrace();
			for (int i = 0; i < trace.length; i++) {
		        System.out.println("Frame " + (i+1) + " : " + trace[i]);
		    }
		}		
		System.out.println("After try catch block");
		return 0.0f;
	}
}
