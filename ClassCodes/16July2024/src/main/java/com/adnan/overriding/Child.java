package com.adnan.overriding;

public class Child extends Parent {

	public void marrige() {
		System.out.println("Marry the girl of own choice");
	}
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.marrige();
	}
}
