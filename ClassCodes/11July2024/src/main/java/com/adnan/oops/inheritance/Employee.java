package com.adnan.oops.inheritance;

public class Employee {
	
	String id;
	String firstName;
	String lastName;
	String gender;
	String age;
	
	
	public Employee(String id, String firstName, String lastName, String gender, String age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	public Employee() {
		
	}
	
	public String toString() {
		return "Employee [ id : " + this.id + " , Name = " + this.firstName + " " + this.lastName + " , Gender = " + this.gender + " , age = " + this.age + " ]";
	}

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee("1", "Adnan", "Khan", "Male", "22");
		
		int age = 20;
		int weight = 65;
		String name = "Adnan";
		
		System.out.println(age);
		System.out.println(weight);
		System.out.println(name);
		
		System.out.println(emp1);
		// o/p -> com.adnan.oops.inheritance.Employee@6d06d69c
		// com.adnan.oops.inheritance.Employee     @      6d06d69c
		// when we try to print reference variable automatically toString() method is called
		// compiler add this toString() automatically
		
		System.out.println(emp1.toString());
		
		
	}
}
