package com.adnan.openinglogic;

import java.util.Random;

import com.adnan.bank.Customer;
import com.adnan.bank.OpenAccountInformation;

public class Logic {
	
	OpenAccountInformation openAccount(Customer cust) {
		
		long generatedAccountNumber;
		OpenAccountInformation newAccountInformation = new OpenAccountInformation();
		
		if(cust.accountType == "SAVING") {
			if(cust.age >= 18 && cust.salary >= 10000 && cust.aadharNumber == 12345) {
				
				System.out.println("All your entered inputs are valid to open a savings account in our bank");
				
				Random randomNumber = new Random();
				generatedAccountNumber = randomNumber.nextLong();
				
				newAccountInformation.accountNumber = generatedAccountNumber;
				newAccountInformation.accountOpenStatus = true;
				newAccountInformation.message = "Welcome " + cust.firstName + " " + cust.lastName + ", \n"
												+ "Your Savings account has been opened in our bank";
			} else {
				newAccountInformation.accountNumber = 0;
				newAccountInformation.accountOpenStatus = false;
				newAccountInformation.message = "Sorry " + cust.firstName + " " + cust.lastName + ", \n"
												+ "Your Savings account can not be opened in our bank as you dont match our requirements";
			}
		}
		
		if(cust.accountType == "CURRENT") {
			if(cust.age >= 24 && cust.salary >= 100000 && cust.aadharNumber == 12345) {
				
				System.out.println("All your entered inputs are valid to open a current account in our bank");
				
				Random randomNumber = new Random();
				generatedAccountNumber = randomNumber.nextLong();
				
				newAccountInformation.accountNumber = generatedAccountNumber;
				newAccountInformation.accountOpenStatus = true;
				newAccountInformation.message = "Welcome " + cust.firstName + " " + cust.lastName + ", \n"
												+ "Your Current account has been opened in our bank";
			} else {
				newAccountInformation.accountNumber = 0;
				newAccountInformation.accountOpenStatus = false;
				newAccountInformation.message = "Sorry " + cust.firstName + " " + cust.lastName + ", \n"
												+ "Your Current account can not be opened in our bank as you dont match our requirements";
			}
		}
		
		return newAccountInformation;
	}
	
	
	
	public static void main(String[] args) {
		
		Logic obj = new Logic();
		
		Customer customer = new Customer();
		customer.firstName = "Adnan";
		customer.lastName = "Khan";
		customer.age = 20;
		customer.aadharNumber = 12345;
		customer.gender = 'M';
		customer.salary = 20000;
		customer.accountType = "SAVING";
		
		OpenAccountInformation generatedAccInfo = obj.openAccount(customer);
		
		System.out.println("Your Account number : " + generatedAccInfo.accountNumber);
		System.out.println(generatedAccInfo.message);
		
	}

}
