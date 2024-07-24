package com.adnan.exceptionhandeling;

public class UsingThrowKeyword {

	
	public static void main(String[] args) {
		
		dummy();
		
	}
	
	public static void dummy() {
		
		int[] myArr = {1,2,3,4,5};
		
		for(int i=0; i<myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
		throw new ArithmeticException();
		
		// you can even use below code
//		ArithmeticException ex = new ArithmeticException();
//		throw ex;
		
	}
	
	
}
