package com.subrat.TrielAndError;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

class Student implements Serializable {
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private LocalDate dateOfAdmission;

	Student(Integer studentId, String studentName, Double studentFees, LocalDate dateOfAdmission) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	public static Student getStudentObject() {
		Integer studentId=Integer.parseInt(IO.readln("enter studentId"));
		String studentName=IO.readln("enter student name");
		Double studentFees=Double.parseDouble(IO.readln("enter student fees"));
		LocalDate dateOfAdmission=LocalDate.parse(IO.readln("enter date of admission(yyyy-MM-dd)"));
		
		return new Student(studentId,studentName,studentFees,dateOfAdmission);
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
}

public class RetrieveObject {
	void main() {
		int choice=Integer.parseInt(IO.readln("enter choice"));
		while (choice==1) {
			try {
				String filepath="E:\\JAVA NOTES\\Student.txt";
				var fos=new FileOutputStream(filepath); 
				var oos=new ObjectOutputStream(fos);
				Student s=Student.getStudentObject();
				oos.writeObject(s);
				IO.println("object stored");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			choice=Integer.parseInt(IO.readln("enter choice"));
			if(choice==0) {
				System.exit(0);
			}
		}
	}
}

//*Program: 1
//----------------
//Write a Program in Java to Perform Serialization and De-serialization
//operation on ArrayList Object.
//Take a BLC class Student
//Instance variables
//studentId – private – Integer
//studentName – private – String
//studentFees – private – Double
//dateOfAdmission – private – LocalDate (java.time)
//Take a parameterized constructor to initialize the instance variables
//Take a Method getStudentObject()
//Method Name - getStudentObject()
//Parameter - No Parameter
//Access Modifier - public and static
//Return type - Student
//This method should take the Student data from client, create and 
//return Student object from this method.
//
//Override toString() method to print Student class properties or 
//variables.
//Take an ELC class StoreObject
//Inside the main method create a for loop which will read the Student 
//object with user choice and Store the Student object to a file called 
//Student.txt
//Take another ELC class RetrieveObject
//This class will retrieve the Student Object from file and print the 
//Student information data.

