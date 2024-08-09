package com.adnan.dto;

import org.springframework.data.repository.CrudRepository;

import com.adnan.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long>{
	
	

}
