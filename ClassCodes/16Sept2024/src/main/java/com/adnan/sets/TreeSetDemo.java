package com.adnan.sets;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("A");
		ts.add("F");
		ts.add("E");
		ts.add("U");
		ts.add("B");
		
		System.out.println(ts);
		
		
		// this would not run as StringBuffer do not have comparable
		
		
//		TreeSet<StringBuffer> strBuff = new TreeSet<StringBuffer>();
//		strBuff.add(new StringBuffer("A"));
//		strBuff.add(new StringBuffer("F"));
//		strBuff.add(new StringBuffer("J"));
//		strBuff.add(new StringBuffer("E"));
//		strBuff.add(new StringBuffer("Q"));
		
		
		TreeSet<Integer> setOfInt = new TreeSet<Integer>();
		setOfInt.add(5);
		setOfInt.add(1);
		setOfInt.add(35);
		setOfInt.add(56);
		setOfInt.add(2);
		
		System.out.println(setOfInt);
		
	} 
	
}
