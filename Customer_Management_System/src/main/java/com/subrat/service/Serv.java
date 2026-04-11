package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Customer;
import com.subrat.repositary.Irepo;

@Service
public class Serv implements Iservice {
	@Autowired
	private Irepo irepo;

	@Override
	public List<Customer> findByCity(String city) {
		
		return irepo.findByCity(city);
	}

	@Override
	public List<Customer> findByAgeBetween(int min, int max) {
		
		return irepo.findByAgeBetween(min, max);
	}

	@Override
	public List<Customer> findByNameStartingWith(String prefix) {
		
		return irepo.findByNameStartingWith(prefix);
	}
	
}
