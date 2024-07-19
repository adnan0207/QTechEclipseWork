package com.adnan.datastructure.singlylinkedlist;

public class SinglyLinkedList {
	
	private Node head;
	
	public void add(int data) {
		if(head == null) {
			Node newNode = new Node(data, null);
			head = newNode;
		}else {
			Node newNode = new Node(data, null);
			Node lastNode = findLastNode(head);
			lastNode.nextNode = newNode;
			
		}
	}

	private Node findLastNode(Node head) {
		Node lastNode = head;
		while(lastNode.nextNode != null) {
			lastNode = lastNode.nextNode;
		}
		return lastNode;
	}
	
	
	public void printList() {
		Node temp = head;
		System.out.print("List : [ ");
		while(temp.nextNode != null) {
			System.out.print(temp.data + ", ");
			temp = temp.nextNode;			
		}
		System.out.println(temp.data + " ]");
	}

	
	public void count() {
		Node temp = head;
		int counter = 0;
		while(temp.nextNode != null) {
			counter++;
			temp = temp.nextNode;			
		}
		counter++;
		System.out.println("There are " + counter + " elements in your list");		
	}
	
	
	private Node search(int data) {
		Node lastNode = head;
		while(lastNode.nextNode != null) {
			
			if(lastNode.data == data) {
				System.out.println("Your element is there in the list");	
				return lastNode;			
			}
			
			lastNode = lastNode.nextNode;
		}
		
		if(lastNode.data == data) {
			System.out.println("Your element is there in the list");	
			return lastNode;			
		}
		System.out.println("Your element is not there in the list");	
		return null;
	}
	
	
	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.printList();
		
		list.search(50);
		list.search(40);
		list.search(550);
		
		list.count();
	}
	
	
	
	
	

}





class Node{
	
	int data;
	Node nextNode;
	
	public Node(int data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public Node() {
		
	}
	
}
