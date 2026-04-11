package com.subrat.service;

import java.util.List;

import com.subrat.entity.Customer;

public interface Iservice {
	
	List<Customer> findByCity(String city);

	List<Customer> findByAgeBetween(int min, int max);

	List<Customer> findByNameStartingWith(String prefix);
}
