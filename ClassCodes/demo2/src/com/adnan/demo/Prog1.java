package com.adnan.demo;

public class Prog1 {

	public static void main(String[] args) {
		
		Prog1 obj = new Prog1();
		obj.reverseNumber(1567498);
		
	}
	
	public void reverseNumber(int x) {
		int reverse = 0;
		
		int number = x;
		while(number != 0) {
			int lastDigit = number%10;
			reverse = reverse*10 + lastDigit;
			number = number/10;
		}
		
		System.out.println("your reversed number is : " + reverse);
	}
}
