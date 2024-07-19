package com.adnan.questions;

import java.util.Scanner;

public class Ques3Loop {

//	Question 3
//
//	Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
	
	
	public static void printTable (int x) {
		
		System.out.println("Table of " + x+ " is : ");
		
		for(int i = 1; i<=10; i++) {
			System.out.println(x + " X " + i + " = " + x*i);
		}
		
	}

	public void printTableNonStatic (int x) {
		
		System.out.println("Table of " + x+ " is : ");
		
		for(int i = 1; i<=10; i++) {
			System.out.println(x + " X " + i + " = " + x*i);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a positive integer you want to print table of : ");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println("Using static method : ");
		
		printTable(x);
		
		System.out.println("Using non static method : ");
		
		Ques3Loop obj = new Ques3Loop();
		obj.printTableNonStatic(x);
		
	}
	
	
}
