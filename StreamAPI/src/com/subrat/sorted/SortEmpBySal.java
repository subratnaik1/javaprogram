package com.subrat.sorted;

import java.util.Comparator;
import java.util.List;

record Employee(int sal) {
	
}
public class SortEmpBySal {
public static void main(String[] args) {
	Employee e1=new Employee(500);
	Employee e2=new Employee(400);
	Employee e3=new Employee(600);
	Employee e4=new Employee(100);
	List<Employee>e=List.of(e1,e2,e3,e4);
	e.stream().map(emp->emp.sal()).sorted(Comparator.reverseOrder()).forEach(IO::println);
}
}
