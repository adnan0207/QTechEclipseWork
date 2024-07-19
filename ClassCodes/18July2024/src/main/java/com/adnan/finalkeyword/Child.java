package com.adnan.finalkeyword;

public class Child extends Parent {
	
	
	void marry() {
		System.out.println("You will marry the girl of my choice (child)");
	}

	
	// this will give error as it is final method
	// final method can't be overridden
//	void property() {
//		System.out.println("You will get my whole property (parents)");
//	}

}

