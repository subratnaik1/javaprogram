package com.subrat.StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

record Student(String name, Double score, String status) {
	
}
public class D {
void main() {
	Student s1=new Student("subrat",60.0,"fail");
	Student s2=new Student("subrat",76.0,"pass");
	Student s3=new Student("subrat",80.0,"pass");
	Student s4=new Student("subrat",40.0,"fail");
	Student s5=new Student("subrat",30.0,"fail");
	Student s6=new Student("subrat",80.0,"pass");
	
	ArrayList<Student>a=new ArrayList<>();
	a.add(s1);
	a.add(s2);
	a.add(s3);
	a.add(s4);
	a.add(s5);
	a.add(s6);
	
	a.stream().filter(s->s.score()>75).forEach(IO::println);
	
}
}
