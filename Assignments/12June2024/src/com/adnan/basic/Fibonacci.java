package com.adnan.basic;

public class Fibonacci {

	public void fib(int input) {
		
		int first = 0;
		int second = 1;
		
		if(input == 1) {
			System.out.println(first);
		}
		
		if(input == 2) {
			System.out.println(first + ", " + second);
		}
		
		if(input >= 3) {
			System.out.print(first + ", " + second);
			
			for(int i=3; i<=input; i++) {
				int next = first + second;
				System.out.print(", " + next);
				first = second;
				second = next;
			}
		}
	}
}
