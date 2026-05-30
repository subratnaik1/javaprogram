package com.subrat.distinct;

import java.util.List;

record Employee(String name) {
	
}
public class FromListEmployeePrintUniqueDeotNames {
public static void main(String[] args) {
	Employee e=new Employee("subrat");
	Employee e1=new Employee("Raj");
	Employee e3=new Employee("Raj");
	Employee e2=new Employee("sritam");
	Employee e4=new Employee("sritam");
	List<Employee>list=List.of(e,e1,e2,e3,e4);
	list.stream().map(emp->emp.name()).distinct().forEach(IO::println);;
}
}
