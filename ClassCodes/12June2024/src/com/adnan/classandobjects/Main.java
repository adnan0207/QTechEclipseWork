package com.adnan.classandobjects;

public class Main {

	public static void main(String[] args) {
		
		List l1 = new List(10, new List());
//		System.out.println("L1 : [ " + l1.value + ", " + l1.next + " ]"); 		
		// here in l1.next it will give one strange value about that we will learn ahead
		// now we will print the values of l1.next also
		System.out.println("L1 : [ " + l1.value + ", [ " + l1.next.value + ", " + l1.next.next + " ] ]"); 
		
		List l2 = new List(20, new List());
		List l3 = new List(30, new List());
		
//		System.out.println("L2 : [ " + l2.value + ", " + l2.next + " ]"); 		
		System.out.println("L2 : [ " + l2.value + ", [ " + l2.next.value + ", " + l2.next.next + " ] ]"); 
//		System.out.println("L3 : [ " + l3.value + ", " + l3.next + " ]"); 		
		System.out.println("L3 : [ " + l3.value + ", [ " + l3.next.value + ", " + l3.next.next + " ] ]"); 
		
		
		// now we are initializing the values of the object values also using parameterized constructor
		List l4 = new List(40, new List(410, null));
		List l5 = new List(50, new List(510, null));
		List l6 = new List(60, new List(610, null));
		
		System.out.println("L4 : [ " + l4.value + ", [ " + l4.next.value + ", " + l4.next.next + " ] ]"); 
		System.out.println("L5 : [ " + l5.value + ", [ " + l5.next.value + ", " + l5.next.next + " ] ]"); 
		System.out.println("L6 : [ " + l6.value + ", [ " + l6.next.value + ", " + l6.next.next + " ] ]"); 
		
		
		List l11 = new List(110, null);
		List l22 = new List(220, null);
		List l33 = new List(330, null);
		
		l11.next = l22;
		l22.next = l33;
//		l33.next = l11;		// if we use this our loop will become infinite loop
		
		//accessing values
		List head = l11;
		while(head != null) {
			System.out.println(head.value);
			head = head.next;
		}
		
	}
}
