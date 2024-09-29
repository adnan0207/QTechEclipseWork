package com.adnan.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Adnan");
		hm.put(2, "Abhay");
		hm.put(3, "Mukul");
		
		System.out.println(hm);
		
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		

		for(Entry<Integer, String> element : entrySet) {
			System.out.println("Key : " + element.getKey());
			System.out.println("Value : " + element.getValue());
		}
		
		entrySet.forEach(ele -> System.out.println("Key : " + ele.getKey()+ "\n" + "Value : " + ele.getValue()));
		
		hm.forEach((key, value) -> System.out.println(key + " " + value));
	
		
		
		
		for(Entry<Integer, String> element : entrySet) {
			System.out.println(element);
		}

		entrySet.forEach(ele -> System.out.println(ele));
		
		
		
		
	}
}
