package com.subrat.limitAndSkip;

import java.util.List;

public class FindSecondHighestSalary {
public static void main(String[] args) {
	Student s1=new Student(300);
	Student s2=new Student(500);
	Student s3=new Student(200);
	Student s4=new Student(700);
	Student s5=new Student(100);
	List<Student>list=List.of(s1,s2,s3,s4,s5);
	list.stream().sorted((st1,st2)->st2.marks()-st1.marks()).skip(1).limit(1).forEach(IO::println);
}
}
