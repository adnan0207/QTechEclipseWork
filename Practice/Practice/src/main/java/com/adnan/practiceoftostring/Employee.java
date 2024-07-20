package com.adnan.practiceoftostring;

public class Employee {
	
	String firstName;
	String lastName;
	String gender;
	String mobileNumber;
	String city;
	
	public Employee() {
	
	}
	
	public Employee(String firstName, String lastName, String gender, String mobileNumber, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.city = city;
	}
	
	public String toString(){
		return "employee details are = Name is : " + this.firstName + " " + this.lastName + " employee gender is " + this.gender + 
				" employee mobile number is " + this.mobileNumber + " employee city is " + this.city ;
	}

}
