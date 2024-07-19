package com.adnan.openinglogic;

import com.adnan.bank.Customer;
import com.adnan.bank.OpenAccountInformation;

public class Logic {

	OpenAccountInformation openAccount(Customer cust) {		// it will give error in Customer as it is a class of different package
											// there are two way to deal with this -> 1. we can import or 2. use fully qualified name
		if(cust.age >= 18) {				// we will get error if use age variable as it from different class of different package 
											// so we need to make it public there
		}

		return null;						// yeh null OpenAccountInformation ke object ke saare variables m null value bhar dega
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
	}
}
