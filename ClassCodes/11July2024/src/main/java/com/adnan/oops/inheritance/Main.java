package com.adnan.oops.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.noOfWheels = 4;
		car1.milage = 12;
		car1.color = "White";
		
		car1.printColor();
		car1.topSpeed();
		
		Bike bike1 = new Bike();
		
		bike1.color = "Black"; 
		bike1.milage = 45;
		bike1.noOfWheels = 2;
		
		bike1.printColor();
		bike1.drivingWheels();
	}
}
