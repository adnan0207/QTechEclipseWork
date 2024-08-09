package com.adnan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adnan.dto.CustomerRepo;
import com.adnan.model.Customer;

// Business Layer / Service Layer
@Service
public class BankingService {
	
	// Business logic
	
	public String welcomeMsg() {
		return "HI, Welcome to my Online Banking App";
	}
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public Long openAccount(Customer customer) {
		Customer newCustomer = customerRepo.save(customer);
		return newCustomer.getAccountNumber();
	}

}
