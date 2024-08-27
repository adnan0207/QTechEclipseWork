package com.adnan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adnan.model.Customer;
import com.adnan.service.BankingService;

@RestController
public class Controller {

	@Autowired
	private BankingService bankSerObj;
	
	@GetMapping("api/v1/greeting")
	public String greeting() {
		String str = bankSerObj.greeting();
		return str;
	}
	
	@PostMapping("api/v1/account")
	public long openAcc(@RequestBody Customer cust) {
		long accNum = bankSerObj.openAccount(cust);
		return accNum;
	}
}
