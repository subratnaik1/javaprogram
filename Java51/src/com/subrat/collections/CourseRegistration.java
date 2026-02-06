package com.subrat.collections;

import java.util.*;

public class CourseRegistration {
	void main() {
		HashMap<String, List<String>> m1 = new HashMap<>();
        IO.println("--- Course Registration Menu ---");
        IO.println("1. Register student to course");
        IO.println("2. Remove student from course ");
        IO.println("3. View course-wise student list");
        IO.println("exit");
        int choice=Integer.parseInt(IO.readln("Enter your choice:"));
        
        switch (choice) {
        case 1->{
        	String course=IO.readln("enter course name:");
        	String sName=IO.readln("enter students name");
        	m1.computeIfAbsent(course,k->new ArrayList<String>()).add(sName);
        	IO.println(sName+" registered to "+course);        	
        }
        case 2->{
        	String course=IO.readln("enter course name:");
        	String sName=IO.readln("enter students name");
//        	m1.computeIfPresent(sName, )
        	IO.println(sName+" has removed from "+course);
        }
        case 3->{
//        	for() {
        		
        	}
        }
        }
	}

