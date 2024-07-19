package com.adnan.datastructure.stack;

public class Main {

	public static void main(String[] args) {
		
		Stack myStack = new Stack();
		
		int ele = myStack.pop();
		System.out.println(ele);
		
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		
		int ele1 = myStack.pop();
		System.out.println(ele1);
		
		int ele2 = myStack.pop();
		System.out.println(ele2);
		
		myStack.push(50);
		myStack.push(60);
		myStack.push(70);
		
		myStack.printStack();
		
		myStack.push(80);
		
		myStack.printStack();
		
		int ele3 = myStack.pop();
		System.out.println(ele3);
		
		myStack.push(80);
		
		int ele4 = myStack.pop();
		System.out.println(ele4);
		
		myStack.push(90);
		myStack.push(100);
		
		int ele5 = myStack.pop();
		System.out.println(ele5);
		
		int ele6 = myStack.pop();
		System.out.println(ele6);
		
		int ele7 = myStack.pop();
		System.out.println(ele7);
		
		int ele8 = myStack.pop();
		System.out.println(ele8);
		
		int ele9 = myStack.pop();
		System.out.println(ele9);
		
		int ele10 = myStack.pop();
		System.out.println(ele10);
		
		myStack.printStack();
	}

}
