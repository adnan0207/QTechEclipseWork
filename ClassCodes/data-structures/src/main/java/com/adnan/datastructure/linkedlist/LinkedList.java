package com.adnan.datastructure.linkedlist;

public class LinkedList {

	private Node head;
	private Node tail;

	
	public void add(int number) {

		if (head == null) {

			Node Node1 = new Node();
			Node1.data = number;
			Node1.nextNode = null;

			head = Node1;
			tail = Node1;

		} else {

			Node addNewNode = new Node();
			addNewNode.data = number;
			addNewNode.nextNode = null;

			tail.nextNode = addNewNode;

			tail = addNewNode;

		}

	}

	
	public void addInBetween(int toAdd, int addAfter) {

		Node headOne;
		Node headTwo;
		
		boolean isNumberThere = false;
		for (Node i = head; i != null; i = i.nextNode) {
			if (i.data == addAfter) {
				isNumberThere = true;
				break;
			}
		}
		
		if (isNumberThere == true) {
			
			headOne = head;
			headTwo = head;
			
			for (Node i = headOne; i != null; i = i.nextNode) {
				if(i.data == addAfter) {
					
					Node oldAddress = i.nextNode;
					headTwo = i;
					
					headTwo.nextNode = new Node();
					
					headTwo.nextNode.data = toAdd;
					headTwo.nextNode.nextNode = oldAddress;
					
				}
			}
		}else {
			System.out.println("The number after which you want to add other number does not exist in Linked List");
		}
	}

	
	public void delete(int number) {

		boolean isNumberThere = false;
		for (Node i = head; i != null; i = i.nextNode) {
			if (i.data == number) {
				isNumberThere = true;
				break;
			}
		}

		if (isNumberThere == true) {
			if (head.data == number) {
				head = head.nextNode;
			} else {
				Node headDelete = head;
				for (Node i = headDelete; i != null; i = i.nextNode) {
					if (i.data == number) {
						headDelete.nextNode = headDelete.nextNode.nextNode;
					}
				}
			}
		} else {
			System.out.println("Entered number is not in your Linked List");
		}
	}

	
	public void printLinkedList() {

		if (head == null || tail == null) {
			System.out.println("There is nothing in your Linked List");
		} else {
			
			System.out.print("Linked List [ ");
			
			for (Node i = head; i != null; i = i.nextNode) {
				
				if (i.nextNode == null) {
					System.out.print(i.data + " ");
				} else {
					System.out.print(i.data + ", ");
				}
				
			}
			
			System.out.println("]");
			
		}
	}

	
	public void count() {
		
		if (head == null || tail == null) {
			System.out.println("There is nothing in your Linked List");
		} else {
			
			int count = 0;
			
			for (Node i = head; i != null; i = i.nextNode) {
				count++;
			}
			
			System.out.println(count + " elements are there in your Linked List");
			
		}
	}

	
	public class Node {
		int data;
		Node nextNode;
	}
}
