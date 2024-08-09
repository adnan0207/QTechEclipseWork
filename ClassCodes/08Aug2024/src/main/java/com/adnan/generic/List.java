package com.adnan.generic;

// T -> Type Parameter -> Object Type
public class List <T>{
	

	private Object[] list = new Object[20];
	private int currentIndex = 0;
	
	public boolean add(T element) {
		list[currentIndex] = element;
		currentIndex++;
		return true;
	}
	
	public void printList() {
		for(int i =0; i< currentIndex; i++) {
			System.out.println(list[i]);
		}
	}


}
