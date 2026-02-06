package com.subrat.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Emp(Integer id,String name,Double sal) {};

public class GreaterSalary {
void main() {
	Emp e1 = new Emp(1, "sn", 90000D);
	Emp e2 = new Emp(2, "aryan", 40000D);
	Emp e3 = new Emp(3, "rahul", 60000D);
	Emp e4 = new Emp(4, "subash", 70000D);
	Emp e5 = new Emp(5, "sgubham", 40000D);
	Emp e6 = new Emp(1, "sn", 90000D);

	List<Emp> collect = Stream.of(e1, e2, e3, e4, e5, e6)
			.filter(emp -> emp.sal() > 50000)
			.distinct()
			   .collect(Collectors.toList());
	              collect.forEach(IO::println);
	 
	 
}
}
