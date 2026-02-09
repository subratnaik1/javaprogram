package com.subrat.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

record Person(String name, Integer age) {

}
public class A1 {
	void main() {
		Person p1=new Person("subrat",25);
		Person p2=new Person("rahul",22);
		Person p3=new Person("sritam",25);
		Person p4=new Person("shubham",16);
		List<Person>l1=new ArrayList<>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		l1.stream().sorted((e1,e2)->e1.age().compareTo(e2.age())).forEach(IO::println);
	
}
}
