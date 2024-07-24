package com.adnan.exceptionhandeling;

public class ReturnInDifferentBlocks {

	public static void main(String[] args) {

		System.out.println(demo());

	}

	public static int demo() {
		try {
			System.out.println(10 / 0);
			return 777;
		} catch (ArithmeticException e) {
			return 888;
		} finally {
			return 999;
		}
	}

}