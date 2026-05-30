package com.subrat.collect;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

record Employee(String name) {
	
}
public class CollectEmployeeNameToList {
public static void main(String[] args) {
Employee e1=new Employee("subrat");
Employee e2=new Employee("rshul");
Employee e3=new Employee("sritam");
Employee e4=new Employee("raj");
List<Employee>list=List.of(e1,e2,e3,e4);
list.stream().map(e->e.name()).collect(Collectors.toList()).forEach(IO::println);
}
}
