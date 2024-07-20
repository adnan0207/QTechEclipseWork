package com.adnan.datastructure.binarysearch;

public class MyMain {

	public static void main(String[] args) {

		int[] arrOdd = new int[9];

		arrOdd[0] = 12;
		arrOdd[1] = 23;
		arrOdd[2] = 54;
		arrOdd[3] = 62;
		arrOdd[4] = 98;
		arrOdd[5] = 106;
		arrOdd[6] = 123;
		arrOdd[7] = 154;
		arrOdd[8] = 189;

		int[] arrEven = new int[10];

		arrEven[0] = 11;
		arrEven[1] = 14;
		arrEven[2] = 45;
		arrEven[3] = 54;
		arrEven[4] = 75;
		arrEven[5] = 84;
		arrEven[6] = 97;
		arrEven[7] = 111;
		arrEven[8] = 184;
		arrEven[9] = 231;
		
		int[] arrTest = new int[16];
		
		arrTest[0] = 10;
		arrTest[1] = 19;
		arrTest[2] = 46;
		arrTest[3] = 64;
		arrTest[4] = 65;
		arrTest[5] = 84;
		arrTest[6] = 97;
		arrTest[7] = 121;
		arrTest[8] = 123;
		arrTest[9] = 156;
		arrTest[10] = 166;
		arrTest[11] = 175;
		arrTest[12] = 186;
		arrTest[13] = 197;
		arrTest[14] = 235;
		arrTest[15] = 256;

		
		
		BinarySearch bS = new BinarySearch();
		
		bS.binarySearch(arrOdd, 154);
		bS.binarySearch(arrEven, 97);
		bS.binarySearch(arrTest, 64);
		bS.binarySearch(arrOdd, 999);
		bS.binarySearch(arrEven, 979);
		bS.binarySearch(arrTest, 649);
		
		
		
		
	}
}
