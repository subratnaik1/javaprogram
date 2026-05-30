package com.subrat.count;

import java.util.List;

record Employee(int sal) {
	
}
public class EmpEarningAbove5000 {
public static void main(String[] args) {
	Employee e1=new Employee(5000);
	Employee e2=new Employee(6000);
	Employee e3=new Employee(8000);
	Employee e4=new Employee(1000);
	List<Employee>list=List.of(e1,e2,e3,e4);
	long count = list.stream().filter(e->e.sal()>5000).count();
	System.out.println(count);
}
}
