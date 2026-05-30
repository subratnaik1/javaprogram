package com.subrat.filter;

import java.util.List;

record Employee(String name, int sal) {
};

public class PrintEmObjectHavingSalGrtThen5000 {
	public static void main(String[] args) {
		Employee e1=new Employee("subrat",50000);
		Employee e2=new Employee("sritam",5000);
		Employee e3=new Employee("rat",4000); 
		List<Employee> list=List.of(e1,e2,e3);
		
		list.stream().filter(e->e.sal()>5000).forEach(IO::println );
	}
}
