package com.adnan.differntuseofclasses;

// we could use classes to write our business logics
// we could use classes as a custom data types to take multiple inputs at once and return multiple values at once

import java.util.Random;

public class BankingServices {
	
	void FundTransfer(int accNumber1, int accNumber2, int amount, int pin) {
		System.out.println("Fund Transfered successfully");
	}
	
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
}
