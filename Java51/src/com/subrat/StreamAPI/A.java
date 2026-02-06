package com.subrat.StreamAPI;

import java.util.ArrayList;

record Employee(Integer id, String name, Double salary) {

}

public class A {
	void main() {
		Employee e1=new Employee(1,"subrat",50000.0);
		Employee e2=new Employee(1,"shritam",60000.0);
		Employee e3=new Employee(1,"raj",70000.0);
		Employee e4=new Employee(1,"kumar",80000.0);
		Employee e5=new Employee(1,"rao",90000.0);
		Employee e6=new Employee(1,"tejas",30000.0);
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.stream()
		.filter(n->n.salary()>50000)
		.forEach(IO::println);
		
	}
}
