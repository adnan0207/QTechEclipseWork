package com.adnan.datastructure.binarysearch;

public class BinarySearch {

	public void binarySearch(int[] arr, int num) {

		int low = 0;
		int high = arr.length - 1;

		int mid;
		mid = (low + high) / 2;

		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == num) {
				System.out.println("Your number " + num + " is found in array at index : " + mid);
				return;
			} else if (arr[mid] > num) {
				high = mid - 1;
			} else if (arr[mid] < num) {
				low = mid + 1;
			}
		}
		System.out.println("Your number " + num + " is not in array at any index");		
	}
}