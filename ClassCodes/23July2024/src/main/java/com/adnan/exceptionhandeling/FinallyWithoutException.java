package com.adnan.exceptionhandeling;

public class FinallyWithoutException {

	public static void main(String[] args) {

		try {
			System.out.println("try block executed");
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}

	}

}
