package com.subrat.inharitance;

import java.util.Scanner;

class Employee
{
	protected int employeeId;
	protected String employeeName;
	protected double employeeSalary;
	
	Employee(int employeeId,String employeeName,double employeeSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
}
class Permanentemployee extends Employee
{
	protected double providentFund;
	Permanentemployee(int employeeId,String employeeName,double employeeSalary){
		super(employeeId,employeeName,employeeSalary);
	this.providentFund=employeeSalary*0.12;	
}
	public String toString() 
	{
		return "PermanentEmployee [employeeeId="+employeeId+"employeeName"+employeeName+"employeeSalary"+employeeSalary+"providentfund"+providentFund+"]";
    }
	public void netSalary() {
		System.out.println(employeeSalary+providentFund);				
	}
}
class ContractEmployee extends Employee
{
	protected int contractDuration;
	ContractEmployee(int employeeId,String employeeName,double employeeSalary,int contractDuration)
	{
		super(employeeId,employeeName,employeeSalary);
		this.contractDuration=contractDuration;
	}
	public String toString() {
		return "ContractEmployee [employeeId"+employeeId+", employeeName"+employeeName+"employeeSalary"+employeeSalary+"contractDuration"+contractDuration+"";
	}
}

public class Test1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter employeeid");
     int employeeId=sc.nextInt();
     sc.nextLine();
     System.out.println("enter employee name");
     String employeeName=sc.nextLine();
     System.out.println("enter employee salary");
     double employeeSalary=sc.nextDouble();
    System.out.println("enter id");
     int employeeId1=sc.nextInt();
     sc.nextLine();
     System.out.println("enter employee name");
     String employeeName1=sc.nextLine();
     System.out.println("enter employee salary");
     double employeeSalary1=sc.nextDouble();
     System.out.println("enter contractduration");
     int contractDuration=sc.nextInt();
     
     Permanentemployee pe=new Permanentemployee(employeeId,employeeName,employeeSalary);
     System.out.println(pe);
     pe.netSalary();  
     ContractEmployee ce=new ContractEmployee(employeeId1,employeeName1,employeeSalary1,contractDuration);
     System.out.println(ce);
	}

}
