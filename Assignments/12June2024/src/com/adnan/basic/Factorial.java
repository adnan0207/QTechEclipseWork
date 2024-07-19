package com.adnan.basic;

public class Factorial {

	public void factorial(int input) {
		
		int fac = 1;
		
		if(input == 0) {
			System.out.print("factorial of " + input + " is : " + fac);
		}
		
		if(input > 0) {
			for(int i=1; i<=input; i++) {
				fac = fac*i;
			}
			System.out.print("factorial of " + input + " is : " + fac);
		}
		
	}
}
