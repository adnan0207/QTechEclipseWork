package com.adnan.stack;

public class Stack {
	
	private int[] stack = new int[5];
	private boolean isStackUnderFlow = false;
	private boolean isStackOverFlow = false;
	private int top = 0;	// points to an index in array where data need to be pushed
	
	public void push(int element) {
		if(top == stack.length) {
			isStackOverFlow = true;
		}
		if(isStackOverFlow == true) {
			System.out.println("Stack Overflow");
		}else {
			stack[top] = element;
			top++;
			isStackUnderFlow = false;
		}
		
	}
	
	public int pop() {
		if(top == 0) {
			isStackUnderFlow = true;
		}
		if(top == stack.length) {
			isStackOverFlow = false;
		}
		int element;
		if(isStackUnderFlow == true) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			element = stack[top-1];
			stack[top-1] = 0;
			top--;
			return element;
		}
	}

	public void printStack() {
		System.out.print("Printing Stack : [ ");
		for(int i=0; i<stack.length; i++) {
			if(i == stack.length-1) {
				System.out.print(stack[i]);
			}else {
				System.out.print(stack[i] + ", ");
			}
		}
		System.out.println(" ]");
		
	}
}
