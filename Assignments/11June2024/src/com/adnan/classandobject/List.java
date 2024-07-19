package com.adnan.classandobject;

public class List {
	
	int value;
    List next;
    public static void main(String[] args) {
        List l1 = new List();
        List l2 = new List();
        List l3 = new List();

        l1.value = 10;
        l2.value = 20;
        l3.value = 30;

        l1.next = l2;
        l2.next = l3;
        l3.next = l1;

        System.out.println(l1.value);

        List l4 = l1.next;

        System.out.println(l4.value);
        System.out.println(l4.next.value);
    }

}
