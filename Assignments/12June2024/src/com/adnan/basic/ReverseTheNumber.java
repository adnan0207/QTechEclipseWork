package com.adnan.basic;

public class ReverseTheNumber {

	public void reverseMyNum(int input) {
		int num = input;
		while(num >= 10) {
			int rev = num % 10;
			System.out.print(rev);
			num = num / 10;
		}
		System.out.print(num);
	}
}
