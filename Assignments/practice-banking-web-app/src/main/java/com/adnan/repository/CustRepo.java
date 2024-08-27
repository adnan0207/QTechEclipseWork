package com.adnan.repository;

import org.springframework.data.repository.CrudRepository;

import com.adnan.model.Customer;

public interface CustRepo extends CrudRepository<Customer, Long>{

}
