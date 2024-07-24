package com.adnan.exceptionhandeling;

public class FinallyWithException {
	
	public static void main(String[] args) {

		try {
			System.out.println("try block executed");
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}
		
		System.out.println("NEW TRY CATCH AND FINALLY");

		try {
			System.out.println(10/0);
			System.out.println("try block executed");
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}

	}

}
