package com.adnan.datastructure.queue;

public class Queue {

	private int[] queue = new int[5];
	private boolean isQueueUnderFlow = false; 
	private boolean isQueueOverFlow = false;
	private int top = 0;

	
	public void push(int element) {
		if(top == queue.length) {
			isQueueOverFlow = true;
		}
		if(isQueueOverFlow == true) {
			System.out.println("Queue Overflow");
		}else {
			queue[top] = element;
			top++;
			isQueueUnderFlow = false;
		}	
	}
	
	
	public int pop() {
		if(top == 0) {
			isQueueUnderFlow = true;
		}
		if(top == queue.length) {
			isQueueOverFlow = false;
		}
		int element;
		if(isQueueUnderFlow == true) {
			System.out.println("Queue Underflow");
			return 0;
		}else {
		element = queue[0];
		for(int i=0; i<top; i++) {
			if(i == top-1) {
				queue[i] = 0;
			}else {
				queue[i] = queue[i+1];
			}
		}
		top --;
		return element;
		}
	}
	
	
	public void printQueue() {
		System.out.print("Printing Queue : [ ");
		for(int i=0; i<queue.length; i++) {
			if(i == queue.length-1) {
				System.out.print(queue[i]);
			}else {
				System.out.print(queue[i] + ", ");
			}
		}
		System.out.println(" ]");
		
	}
	
	
	
}
