package com.adnan.listexample;

import java.util.ArrayList;

import com.adnan.polyexample.Animal;
import com.adnan.polyexample.Cat;
import com.adnan.polyexample.Dog;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(new String("Adnan"));
		al.add(new String("Abhay"));
		al.add(new String("Shivansh"));

		System.out.println(al);

		al.add(5);

		System.out.println(al);

		for (int i = 0; i < 4; i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}

		boolean contains = al.contains("Adnan");
		System.out.println(contains);

		
		
		
		// parent class reference can hold child class object
		
		
		Dog dog1 = new Dog(); 
		dog1.sound();
		
		Cat cat1 = new Cat();
		cat1.sound();
		
		ArrayList animalList = new ArrayList();
		animalList.add(dog1);
		animalList.add(cat1);
		
		// if we already know that we are going to get dog object then we can use this method
		
		
//		Dog d1 = animalList.get(0);			// this will give error // we need to type cast
		Dog d1 = (Dog) animalList.get(0);
		d1.kuttaPana();
		
		// or we can take object class variable as it the parent of each and every class
		
		
		//  if we dont know what we are gonna get then we can do this
		
		Object dg1 = animalList.get(0);
		
		if (dg1 instanceof Dog) {
			Dog kutta = (Dog) dg1;
			kutta.kuttaPana();
		}else if (dg1 instanceof Cat) {
			Cat billi = (Cat) dg1;
			billi.billiPana();
		}
		
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(dog1);
		animals.add(cat1);
		
		Animal animal01 = animals.get(0);
		
		if (animal01 instanceof Dog) {
			Dog doggy = (Dog) animal01;
			doggy.kuttaPana();
		}else if (animal01 instanceof Cat) {
			Cat billu = (Cat) animal01;
			billu.billiPana();
		}
		
		
		
	}

}
