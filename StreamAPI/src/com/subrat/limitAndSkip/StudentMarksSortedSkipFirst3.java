package com.subrat.limitAndSkip;

import java.util.List;

record Student(int marks) {
	
}
public class StudentMarksSortedSkipFirst3 {
public static void main(String[] args) {
	Student s1=new Student(70);
	Student s2=new Student(30);
	Student s3=new Student(40);
	Student s4=new Student(80);
	List<Student>list=List.of(s1,s2,s3,s4);
	list.stream().sorted((st1,st2)->st2.marks()-st1.marks()).limit(3).forEach(IO::println);;
}
}
