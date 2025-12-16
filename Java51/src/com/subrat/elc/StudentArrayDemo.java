package com.subrat.elc;
import com.subrat.blc.Student;
import java.util.Arrays;

public class StudentArrayDemo {

	public static void main(String[] args) {
	
     Student student[]=new Student[3];
     student[0]=new Student(101,"subrat",89.5);
     student[1]=new Student(102,"ganesh",92.0);
     student[2]=new Student(103,"ganesh",85.75);
     
     for(Student s:student) {
    	 System.out.println(s);
     }
	}

}
