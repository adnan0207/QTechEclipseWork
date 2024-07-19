package com.adnan.datastructure.linkedlist;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList obj = new LinkedList();

		obj.printLinkedList();
		
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		
		obj.delete(20);
		obj.printLinkedList();

		obj.delete(840);
		obj.printLinkedList();
		
		obj.count();
		
		obj.add(40);
		obj.add(50);
		obj.printLinkedList();
		
		obj.delete(10);
		obj.printLinkedList();
		
		obj.delete(30);
		obj.printLinkedList();
		obj.count();
		
		obj.delete(40);
		obj.printLinkedList();
		obj.count();

		obj.add(60);
		obj.add(70);
		obj.add(80);
		
		obj.printLinkedList();
		obj.count();
		
		obj.addInBetween(100, 60);
		
		obj.printLinkedList();
		obj.count();
		
		
	}

}
