package com.adnan.polyexample;

public class MyMain {

	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog(); 
		dog1.sound();
		dog1.kuttaPana();
		
		Cat cat1 = new Cat();
		cat1.sound();
		cat1.billiPana();
		
		// parent class reference variable can hold child class objects
		
	
		
		Animal animal = new Animal();
		animal.sound();
		
	
		
		
		Animal animal2 = new Dog();
		animal2.sound();
		// we can not call child object method when is assigned to parent variable only overridden methods can be called or those which are present in parent
//		animal2.kuttaPana();	
		
		if (animal2 instanceof Dog) {
			Dog d1 = (Dog) animal2;
			d1.kuttaPana();
		}else if (animal2 instanceof Cat) {
			Cat c1 = (Cat) animal2;
			c1.billiPana();
		}
		
		
		Animal animal3 = new Cat();
		animal3.sound();
		
		if (animal3 instanceof Dog) {
			Dog d1 = (Dog) animal3;
			d1.kuttaPana();
		}else if (animal3 instanceof Cat) {
			Cat c1 = (Cat) animal3;
			c1.billiPana();
		}
		
		
		
		
	}
}
