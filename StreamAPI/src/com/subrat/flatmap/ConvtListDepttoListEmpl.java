package com.subrat.flatmap;

import java.util.List;

record Department(List<Employee>e) {

}

record Employee(String name) {

}

public class ConvtListDepttoListEmpl {
	public static void main(String[] args) {
		Employee e1=new Employee("subrat");
		Employee e2=new Employee("Sritam");
		Employee e3=new Employee("rja");
		List<Employee> em1=List.of(e1,e2,e3);
		List<Employee> em2=List.of(e1,e2,e3);
		List<Employee> em3=List.of(e1,e2,e3);
		Department d1=new Department(em1);
		Department d2=new Department(em2);
		Department d3=new Department(em3);
		List<Department>dept=List.of(d1,d2,d3);
		dept.stream().flatMap(d->d.e().stream()).forEach(IO::println);
		
	}
}
