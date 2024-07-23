package com.adnan.questions;

/*
 * 
 * Given two arrays arr1 and arr2 of equal size, the task is to find whether the given arrays are equal. Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.

Examples:

Input: arr1[] = [1, 2, 5, 4, 0], arr2[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]
Input: arr1[] = [1, 2, 5], arr2[] = [2, 4, 15]
Output: false
Explanation: arr1[] and arr2[] have only one common value.
 * 
 * */

public class CheckEqualArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 5, 4, 0 };
		int[] arr2 = { 2, 4, 5, 0, 1 };

		int[] arr3 = { 1, 2, 5 };
		int[] arr4 = { 2, 4, 15 };
		
		CheckEqualArray obj = new CheckEqualArray();
		System.out.println(obj.check(arr1, arr2));
		System.out.println(obj.check(arr3, arr4));
	}

	public boolean check(int[] arr1, int[] arr2) {
		
		arr1 = sortingTheArray(arr1);
		arr2 = sortingTheArray(arr2);

		if(arr1.length != arr2.length) {
			return false;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	private int[] sortingTheArray(int[] arr) {
		for(int i = 0; i<arr.length - 1; i++) {
			for(int j = 0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
