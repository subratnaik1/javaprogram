package com.subrat.StreamAPI;

import java.util.ArrayList;
import java.util.List;

record Employee2(Integer id,Double Salary) {
	
}
public class A3 {
void main() {
	Employee2 e1=new Employee2(1,300.0);
	Employee2 e2=new Employee2(3,200.0);
	Employee2 e3=new Employee2(2,500.0);
	List <Employee2>l1=new ArrayList<>();
	l1.add(e1);
	l1.add(e2);
	l1.add(e3);
	l1.stream().sorted((n1,n2)->n2.Salary().compareTo(n1.Salary())).forEach(IO::println);
}
}
