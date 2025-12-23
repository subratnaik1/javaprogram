package com.subrat.predicate;

import java.util.function.Consumer;

record Student(Integer id,String name,Double marks) {
	
}
public class StudentD {
void main() {
	Integer id=Integer.parseInt(IO.readln("enter id"));
	String name=IO.readln("enter name");
	Double marks=Double.parseDouble(IO.readln("enter marks"));
	Student st=new Student(id,name,marks);
	Consumer<Student>student=std->{
		System.out.println(std.id());
		System.out.println(std.name());
		System.out.println(std.marks());
	};
	student.accept(st);
}
}
