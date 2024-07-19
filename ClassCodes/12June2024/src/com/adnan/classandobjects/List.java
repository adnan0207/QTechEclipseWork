package com.adnan.classandobjects;

public class List {
	
	int value;
	List next;
	
	public List() {
		
	}
	
	public List(int valueNumber, List nextObject) {
		this.value = valueNumber;
		this.next = nextObject;				// here we need an object input as it's data type is class i.e. custom data type
	}

}
