package com.subrat.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Customer;
import com.subrat.repositary.Irepo;
import com.subrat.service.Iservice;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice iserv;
	@Autowired
	private Irepo irepo;
	

	@Override
	public void run(String... args) throws Exception {

		Customer a = new Customer(1, "subrat", "Odisha", 25);
		Customer b = new Customer(2, "raj", "Odisha", 22);
		Customer c = new Customer(3, "rohan", "hyd", 21);
		Customer d = new Customer(4, "ahan", "hyd", 20);
		Customer e = new Customer(5, "ganesh", "rajasthan", 29);

		List<Customer>list=List.of(a,b,c,d,e);
						
		irepo.saveAll(list);
		List<Customer> all=irepo.findAll();
		all.forEach(IO::println);
		
		List<Customer> byCity = iserv.findByCity("odisha");
		byCity.forEach(IO::println);
		
		List<Customer> byAgeBetween = iserv.findByAgeBetween(20, 21);
		byAgeBetween.forEach(IO::println);
		
		iserv.findByNameStartingWith("s").forEach(IO::println);
		
	}

}
