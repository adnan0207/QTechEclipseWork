package com.adnan.conditionalstatements;

public class ConditionalStatementsANDandOR {

	void openAccount(long salary, int age, int aadharNumber) {
		if(salary >= 100000) {
			if(age >= 18) {
				if(aadharNumber == 12345) {
					System.out.println("CONGRAGULATIONS you can open your account in our bank");
				}else {
					System.out.println("SORRY we can not open your account as your aadhar number is invalid");
				}
			}else {
				System.out.println("SORRY we can not open your account as you are not an adult");
			}
		}else {
			System.out.println("SORRY we can not open your account as you have less salary");
		}
	}
	
	
	void openAccountAdvancedWay(long salary, int age, int aadharNumber) {
		if(salary >= 100000 && age >= 18 && aadharNumber == 12345) {		//checks all the conditions
			System.out.println("CONGRAGULATIONS you can open your account in our bank");
		}else {
			System.out.println("SORRY we can not open your account");
		}
	}
	
	void openAccountWithOR(long salary, int age, int aadharNumber) {
		if(salary >= 100000 || age >= 18 || aadharNumber == 12345) {		//Only checks one of the condition
			System.out.println("CONGRAGULATIONS you can open your account in our bank");
		}else {
			System.out.println("SORRY we can not open your account");
		}
	}

	public static void main(String[] args) {
		ConditionalStatementsANDandOR obj1 = new ConditionalStatementsANDandOR();
		obj1.openAccount(2000000, 19, 12345);
		obj1.openAccount(2000, 19, 12345);
		obj1.openAccount(2000000, 16, 12345);
		obj1.openAccount(2000000, 19, 1235);
		
		
		obj1.openAccountAdvancedWay(2000000, 19, 12345);
		obj1.openAccountAdvancedWay(2000, 19, 12345);
		obj1.openAccountAdvancedWay(2000000, 16, 12345);
		obj1.openAccountAdvancedWay(2000000, 19, 1235);
		
		
		obj1.openAccountWithOR(2000000, 19, 12345);
		obj1.openAccountWithOR(2000, 19, 12345);
		obj1.openAccountWithOR(2000000, 16, 12345);
		obj1.openAccountWithOR(2000000, 19, 1235);
		
		
	}
}
