package com.subrat.peek;

import java.util.List;

record Employee(String name) {

}

public class TraceEmpAfterApplFilter {
	public static void main(String[] args) {
    Employee e1=new Employee("subrat");
    Employee e2=new Employee("Raj");
    Employee e3=new Employee("Rahul");
    Employee e4=new Employee("azad");
    List<Employee>list=List.of(e1,e2,e3,e4);
    list.stream().peek(i->System.out.println("brfore mapping "+i.name())).map(e->e.name().toUpperCase()).forEach(n->System.out.println("after mapping"+n));
	}
}
