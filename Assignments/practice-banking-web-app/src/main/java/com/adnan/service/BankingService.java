package com.adnan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adnan.model.Customer;
import com.adnan.repository.CustRepo;

@Service
public class BankingService {
	
	@Autowired
	private CustRepo custRepo;
	
	public String greeting() {
		String str = "Hi this is my practice web app";
		return str;
	}
	
	public long openAccount(Customer cust) {
		Customer customer = custRepo.save(cust);
		return customer.getAccountNumber();
	}

}
