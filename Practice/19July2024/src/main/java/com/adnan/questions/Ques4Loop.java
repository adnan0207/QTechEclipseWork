package com.adnan.questions;

import java.util.Scanner;

public class Ques4Loop {

//	Question 4
//
//	Write a program to find the factorial value of any number entered through the keyboard. 
	
	
	public int factorial(int x) {
		int fac = 1;
		for(int i = 1; i<=x ; i++) {
			fac = fac*i;
		}
		return fac;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number whose factorial you want : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		Ques4Loop obj = new Ques4Loop();
		
		int fac = obj.factorial(num);
		
		System.out.println("Factorial of " + num + " is " + fac);
		
		
		
	}
	
}
