package com.adnan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adnan.model.Customer;
import com.adnan.service.BankingService;

// Controller Layer
@RestController
public class BankingController {
	
	@Autowired
	private BankingService bankingServiceObj;

	@GetMapping("/api/v1/greeting")
	public String greeting() {
		String msg = bankingServiceObj.welcomeMsg();
		return msg;
	}
	
	@PostMapping("/api/v1/account")
	public long openAccount(@RequestBody Customer customer) {
		Long accountNumber = bankingServiceObj.openAccount(customer);
		return accountNumber;
	}
}
