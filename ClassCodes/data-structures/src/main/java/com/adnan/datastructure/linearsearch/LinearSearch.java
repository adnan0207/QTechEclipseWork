package com.adnan.datastructure.linearsearch;

public class LinearSearch {

	public void linearSearch(int[] arr, int num) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				System.out.println("Your number " + num + " is found in the array at index " + i);
				return;
			}
		}
		System.out.println("Your number " + num + " is not found in the array");
	}
	
}
