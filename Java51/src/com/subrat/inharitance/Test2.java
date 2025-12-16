package com.subrat.inharitance;

import java.util.Scanner;

class Student
{
	protected  int studentId;
	protected String name;
	protected double examFee;
	
	Student(int studentId,String name,double examFee)
	{
		this.studentId=studentId;
		this.name=name;
		this.examFee=examFee;
	}
	public double payFee(double amount) {
		return amount-examFee;
	}
	
	public String toString() {
		return "Student[name"+name+"studentId="+studentId+",examFee"+examFee+"]";
	}
}
class Dayscholar extends Student
{
	protected double transportFee;
	Dayscholar(int studentId,String name,double examFee,double transportFee )
	{
		super(studentId,name,examFee);
		this.transportFee=transportFee;
	}
	public double payFee(double amount) {
		return transportFee+examFee-amount;
	}
	public String displayDetails() {
		return toString();
	}
	public String toString() {
		return "Dayscholar[transportFee="+transportFee+"name="+name+",studentId="+studentId+",examFee="+examFee+"]";
	}
}
class Hosteller extends Student
{
	protected double hostelFee;
	Hosteller(int studentId,String name,double examFee,double hostelFee)
	{
		super(studentId,name,examFee);
		this.hostelFee=hostelFee;
	}
	public double payFee(double amount) {
		return hostelFee+examFee-amount;
	}
	public String displayDetails() {
		return toString();
	}
	public String toString() {
		return "Hosteller[HostelFee="+hostelFee+"name"+name+",studentId="+studentId+",examFee="+examFee+"";
	}
	
}

public class Test2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1 for dayscholar,2for hosteller");
    int choice=sc.nextInt();
    System.out.println("enter studentId");
    int studentId=sc.nextInt();
    sc.nextLine();
    System.out.println("enter name");
    String name=sc.nextLine();
    System.out.println("enter examfee");
    double examFee=sc.nextDouble();
    System.out.println("enter transportFee");
    double transportFee=sc.nextDouble();
    System.out.println("enter amount paid");
    double amount=sc.nextDouble();
   
    switch(choice) {
    case 1->{Dayscholar ds=new Dayscholar(studentId,name,examFee,transportFee);
           double amountPaid=ds.payFee(amount);
           if(amountPaid==0) {
        	   System.out.println("all fees are clear");
           }
           else if(amountPaid<0) {
        	   
           }
    }
	}
	
	}

}
