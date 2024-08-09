package com.adnan.nongeneric;

public class List {
	
	private int[] list = new int[20];
	private int currentIndex = 0;
	
	public boolean add(int element) {
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
