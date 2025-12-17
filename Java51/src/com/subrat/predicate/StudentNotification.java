package com.subrat.predicate;

import java.util.function.Consumer;


record Student(Integer id,String name,String course) {		
}
public class StudentNotification {

    void main() {    	
    Integer noOfStud=Integer.parseInt(IO.readln("enter number of student"));
    Student arr[]=new Student[noOfStud];
    int count=0;
    for(int i=0;i<noOfStud;i++) {
    count++;
    IO.println("Enter details for Student "+count);
    Integer id= Integer.parseInt(IO.readln("enter ID:"));
    String name=IO.readln("enter name:");
    String course=IO.readln("enter course:");
    arr[i]=new Student(id,name,course);
    
    Consumer<Student> stud=s->IO.println("Hello "+name+"! Welcome to the "+course);
    stud.accept(arr[i]);
  
    }
	}

}
