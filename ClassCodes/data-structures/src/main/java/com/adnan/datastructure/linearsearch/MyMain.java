package com.adnan.datastructure.linearsearch;

public class MyMain {

	public static void main(String[] args) {
		
		int[] arrOdd = new int[5];
		
		arrOdd[0] = 12;
		arrOdd[1] = 62;
		arrOdd[2] = 54;
		arrOdd[3] = 98;
		arrOdd[4] = 23;
		
		int[] arrEven = new int[6];
		
		arrEven[0] = 84;
		arrEven[1] = 75;
		arrEven[2] = 54;
		arrEven[3] = 14;
		arrEven[4] = 45;
		arrEven[5] = 11;
		
		
		LinearSearch lS = new LinearSearch();
		
		lS.linearSearch(arrOdd, 23);
		lS.linearSearch(arrOdd, 54);
		lS.linearSearch(arrOdd, 12);
		lS.linearSearch(arrOdd, 56);
		
		lS.linearSearch(arrEven, 75);
		lS.linearSearch(arrEven, 14);
		lS.linearSearch(arrEven, 11);
		lS.linearSearch(arrEven, 84);
		lS.linearSearch(arrEven, 23);
		
		
	}
}
