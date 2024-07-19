package com.adnan.input;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your 1st number : ");
		int x = sc.nextInt();
		
		System.out.print("Enter your 2nd number : ");
		int y = sc.nextInt();
		
		System.out.println("Your numbers sums up to : " + add(x,y));
	}
	
	static int add(int x, int y) {
		return x+y;
	}
}
