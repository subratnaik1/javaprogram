package com.subrat.map;

import java.util.List;
import java.util.stream.Collectors;

record Employee(String name) {
	
}
public class ExtractEmployeeNames {
public static void main(String[] args) {
	Employee e1=new Employee("subrat");
	Employee e2=new Employee("sritam");
	Employee e3=new Employee("rahul");
	List<Employee>list=List.of(e1,e2,e3);
	list.stream().map(e->e.name()).collect(Collectors.toList()).forEach(IO::println);
}
}
