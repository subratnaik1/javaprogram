package com.subrat.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Employee;
import com.subrat.entity.IdCard;
import com.subrat.service.Iservice;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice serv;

	@Override
	public void run(String... args) throws Exception {

		while(true) {
			int choice=Integer.parseInt(IO.readln("enter your choice"));
			switch(choice) {
			case 1->{
				IdCard i=new IdCard(2l,"permanent","public","subrat");
				Employee e=new Employee("raj","loan",5000.0);
				e.setIdcard(i);
				serv.addEmp(List.of(e));
				IO.println("employee saved");
			}
			case 2->{
				serv.viewEmp().forEach(IO::println);
			}
			case 3->{
				Long id=Long.parseLong(IO.readln("enter id"));
				Optional<Employee> searchById = serv.searchById(id);
				
				searchById.ifPresent(IO::println);
			
			}
			}
		}
	}
	

}
