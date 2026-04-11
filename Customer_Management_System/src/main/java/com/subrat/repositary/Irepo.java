package com.subrat.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Customer;

public interface Irepo extends JpaRepository<Customer, Integer> {

	List<Customer> findByCity(String city);
	
	List<Customer> findByAgeBetween(int min, int max);
	
	List<Customer>findByNameStartingWith(String prefix);


}
