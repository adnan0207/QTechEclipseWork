package com.adnan.runing;

import java.util.Scanner;

import com.adnan.basic.Factorial;
import com.adnan.basic.Fibonacci;
import com.adnan.basic.ReverseTheNumber;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How long Fibonacci Series you want : ");
		int x = sc.nextInt();
		Fibonacci obj1 = new Fibonacci();
		obj1.fib(x);
		
		System.out.println();
		
		System.out.print("Enter number to find factorial : ");
		int y = sc.nextInt();
		Factorial obj2 = new Factorial();
		obj2.factorial(y);
		
		System.out.println();
		
		System.out.print("Enter number you want to reverse : ");
		int z = sc.nextInt();
		ReverseTheNumber obj3 = new ReverseTheNumber();
		obj3.reverseMyNum(z);
	}
}
