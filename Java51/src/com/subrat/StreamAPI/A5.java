package com.subrat.StreamAPI;

import java.util.ArrayList;
import java.util.List;

record Empl(Integer id,Double salary) {
	
}
public class A5 {
void main() {
	Empl e1=new Empl(1,40000D);
	Empl e2=new Empl(2,20000D);
	Empl e3=new Empl(3,50000D);
	Empl e4=new Empl(4,30000D);
	
	List<Empl>l1=new ArrayList<>();
	l1.add(e1);
	l1.add(e2);
	l1.add(e3);
	l1.add(e4);
	l1.stream().filter(em->em.salary()>30000).forEach(IO::println);
}
}
