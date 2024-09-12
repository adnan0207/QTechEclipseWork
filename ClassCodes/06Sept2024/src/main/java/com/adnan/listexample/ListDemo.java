package com.adnan.listexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(new String("Adnan"));
		al.add(new String("Abhay"));
		al.add(new String("Shivansh"));

		System.out.println(al);

		al.add(5);

		System.out.println(al);

		for (int i = 0; i < 4; i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}

		boolean contains = al.contains("Adnan");
		System.out.println(contains);

		
		
		Collection a2 = new ArrayList();
		a2.add(1);
		a2.add(2);
		a2.add(3);

		
		al.addAll(a2);
		
		System.out.println(al);
		
		
		Collection a3 = new HashSet();
		
		a3.add(new Object());
		a3.add(new Object());
		a3.add(new Object());

		al.addAll(a3);
		
		System.out.println(al);
		
		
	}

}
