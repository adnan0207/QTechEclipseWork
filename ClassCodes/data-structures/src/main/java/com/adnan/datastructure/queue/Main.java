package com.adnan.datastructure.queue;

public class Main {

	public static void main(String[] args) {
		
		Queue myQueue = new Queue();
		
		myQueue.push(10);
		myQueue.push(20);
		myQueue.push(30);
		myQueue.push(40);
		myQueue.push(50);
		myQueue.push(60);
		
		myQueue.printQueue();
		
		int ele1 = myQueue.pop();
		System.out.println(ele1);
		
		int ele2 = myQueue.pop();
		System.out.println(ele2);
		
		int ele3 = myQueue.pop();
		System.out.println(ele3);
		
		myQueue.printQueue();
		
		int ele4 = myQueue.pop();
		System.out.println(ele4);
		
		int ele5 = myQueue.pop();
		System.out.println(ele5);
		
		myQueue.printQueue();
		
		int ele6 = myQueue.pop();
		System.out.println(ele6);
		
		myQueue.printQueue();
		
		myQueue.push(110);
		myQueue.push(210);
		myQueue.push(310);
		
		int ele7 = myQueue.pop();
		System.out.println(ele7);
		
		myQueue.printQueue();
		
		int ele8 = myQueue.pop();
		System.out.println(ele8);
		
		myQueue.printQueue();
		
		myQueue.push(410);
		
		myQueue.printQueue();
		
		int ele9 = myQueue.pop();
		System.out.println(ele9);
		
		myQueue.push(510);
		myQueue.push(610);
		myQueue.push(710);
		
		myQueue.printQueue();
		
		myQueue.push(810);
		myQueue.push(910);
		
		myQueue.printQueue();
		
		int ele10 = myQueue.pop();
		System.out.println(ele10);
		
		myQueue.printQueue();
		
		myQueue.push(1010);
		
		myQueue.printQueue();
		
		int ele11 = myQueue.pop();
		System.out.println(ele11);
		
		myQueue.printQueue();
		
		int ele12 = myQueue.pop();
		System.out.println(ele12);
		
		myQueue.printQueue();
		
		int ele13 = myQueue.pop();
		System.out.println(ele13);
		
		myQueue.printQueue();
		
		int ele14 = myQueue.pop();
		System.out.println(ele14);
		
		myQueue.printQueue();
		
		int ele15 = myQueue.pop();
		System.out.println(ele15);
		
		myQueue.printQueue();
		
		int ele16 = myQueue.pop();
		System.out.println(ele16);
		
		myQueue.printQueue();
		
	}
}
