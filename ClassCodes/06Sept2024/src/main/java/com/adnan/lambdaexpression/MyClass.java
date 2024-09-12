package com.adnan.lambdaexpression;

public class MyClass {
	
	public static void main(String[] args) {
		
		
		Greetings grt = () -> System.out.println("Greetings");
		grt.greet();
		
		
		StringLength stL = str -> str.length();
		int lengthOfString = stL.stringLengthFinder("Adnan");
		System.out.println(lengthOfString);
		
		
		AddingNumbers addNum = (a, b) -> a+b;
		int result = addNum.add(15, 30);
		System.out.println(result);
		
		
		MyClass myC = new MyClass();
		myC.printTable(addNum);
		
	}
	
	
	public void printTable(AddingNumbers addNumbers) {
		int num = addNumbers.add(20, 30);
		System.out.println(num);
	}

	
}
