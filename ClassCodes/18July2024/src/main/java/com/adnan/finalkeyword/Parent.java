package com.adnan.finalkeyword;

public class Parent {
	
	final float pi = 3.14f;
	float NonFinalPi = 3.14f;
	public static final String surname = "Khan";
	
	
	void marry() {
		System.out.println("You will marry the girl of our choice (parents)");
//		pi = pi+5;	this will give error as final variables can not be reinitialized
		NonFinalPi = NonFinalPi + 5;
	}

	final void property() {
		System.out.println("You will get my whole property (parents)");
	}
	
}
