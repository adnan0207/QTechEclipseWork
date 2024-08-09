package com.adnan.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingController {
	
	@GetMapping("/api/v1/greeting")
	public String greeting() {
		return "Hi, my name is Adnan and WELCOME to my Banking Application.";
	}
	

}
