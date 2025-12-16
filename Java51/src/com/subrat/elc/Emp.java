package com.subrat.elc;

import java.util.Scanner;

import com.subrat.blc.FullTimeEmployee;
import com.subrat.blc.PartTimeEmployee;

public class Emp {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("***Salary Calculation Menue***");
    System.out.println("1)-FullTime Employees ");
    System.out.println("2)- PartTime Employees");
    System.out.println("Please select the Employee type");
    int choice=Integer.parseInt(sc.nextLine());
    if(choice==1) {
    	System.out.println("Enter Fulltime Employee ID");
    	int id=Integer.parseInt(sc.nextLine());
    	System.out.println("Enter fulltime Employee Name");
    	String name=sc.nextLine();
    	System.out.println("Enter Salary");
    	double salary=Double.parseDouble(sc.nextLine());
    	FullTimeEmployee fe=new FullTimeEmployee(id,name,salary);
    	
    	System.out.println(name+"Salary is :"+fe.calculateSalary());
    }
    if(choice==2) {
    	  System.out.println("***Salary Calculation Menue***");
    	  System.out.println("Enter PartTime Employee Id :");
    	  System.out.println("Enter Fulltime Employee ID");
      	 int id=Integer.parseInt(sc.nextLine());
      	 System.out.println("Enter fulltime Employee Name");
      	 String name=sc.nextLine();
      	 System.out.println("enter your hourly rate");
      	 double hourlyrate=Double.parseDouble(sc.nextLine());
      	 System.out.println("enter your total works hour in the month:");
      	 double hoursWorked=Double.parseDouble(sc.nextLine());
     	PartTimeEmployee pe=new PartTimeEmployee(id,name,hourlyrate,hoursWorked) ;
     	
    	System.out.println(name+"Salary is :"+pe.calculateSalary());
    }
	}

}
