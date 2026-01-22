package com.subrat.predicate;

import java.util.function.Consumer;


record Student2(Integer id,String name,String course) {		
}
public class StudentNotification {

    void main() {    	
    Integer noOfStud=Integer.parseInt(IO.readln("enter number of student"));
    Student2 arr[]=new Student2[noOfStud];
    int count=0;
    for(int i=0;i<noOfStud;i++) {
    count++;
    IO.println("Enter details for Student "+count);
    Integer id= Integer.parseInt(IO.readln("enter ID:"));
    String name=IO.readln("enter name:");
    String course=IO.readln("enter course:");
    arr[i]=new Student2(id,name,course);
    
    Consumer<Student2> stud=s->IO.println("Hello "+name+"! Welcome to the "+course);
    stud.accept(arr[i]);
 
    }
	}

}
//Assignment 02
//-------------
//Develop a scenario based program by using Functional interface to provide the notification to the student on successful registration on a particular course.
//
//Coding Requirement :
//---------------------
//Take a record Student
//Components :
//id : Integer
//name : String
//course : String
//
//Take an ELC class StudentNotification with main method where :
//
//Create a Consumer<Student> to write a welcome notification message.[see the Test cases for more details]
//
//Take IO class for taking the input i.e. number of students [see Test Cases], Inside the loop take Student object and with the help of Consumer<T>, register the student in 
//a particular course using notification message.
//
//Test Cases :
//------------
//Test Case 01 :
//--------------
//Enter number of students: 3
//
//Enter details for Student 1:
//Enter ID: 101
//Enter Name: Ravishankar
//Enter Course: Java
//Hello Ravishankar! Welcome to the Java course.
//
//Enter details for Student 2:
//Enter ID: 102
//Enter Name: Rohan
//Enter Course: Advanced Java
//Hello Rohan! Welcome to the Advanced Java course.
//
//Enter details for Student 3:
//Enter ID: 103
//Enter Name: Elina
//Enter Course: Spring Boot
//Hello Elina! Welcome to the Spring Boot course.
