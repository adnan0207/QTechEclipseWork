package com.adnan.generic;

public class MyMain {
	
	public static void main(String[] args) {
		
		List<String> listOfString = new List<String>();
		
		listOfString.add("Adnan");
		listOfString.add("Abhay");
		listOfString.add("Shivansh");
		
		listOfString.printList();
		
				
		List<Integer> listOfInteger = new List<Integer>();

		listOfInteger.add(12);
		
//		UnBoxing
//		converting an object of a wrapper type to its corresponding primitive value.
		int x = new Integer(15);
		listOfInteger.add(x);
		
//		AutoBoxing
//		the conversion of a primitive value into an object of the corresponding wrapper class is called AutoBoxing
		Integer y = 89;
		listOfInteger.add(y);
				
		listOfInteger.add(56);
		listOfInteger.add(65);
		
		listOfInteger.printList();
		
		
		List<Float> listOfFloat = new List<Float>();
		
		listOfFloat.add(54.55f);
		listOfFloat.add(41.98f);
		listOfFloat.add(15.62f);
		
		listOfFloat.printList();
		
	}

}
