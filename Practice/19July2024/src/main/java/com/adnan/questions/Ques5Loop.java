package com.adnan.questions;

import java.util.Scanner;

public class Ques5Loop {

	
//	Question 5
//
//	Two numbers are entered through the keyboard. Write a program to find the value of one number 
//	raised to the power of another. (Do not use Java built-in method)
	
	
	public int ans(int base, int power) {
		int answer = 1;
		for(int i=1; i<=power; i++) {
			answer = answer*base;
		}
		return answer;
	} 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base number : ");
		int base = sc.nextInt();
		
		System.out.println("Enter the power number : ");
		int power = sc.nextInt();
		
		Ques5Loop obj = new Ques5Loop();
		int ans = obj.ans(base, power);
		System.out.println(base + " raise to the power of " + power + " is " + ans);
		
	} 
}
