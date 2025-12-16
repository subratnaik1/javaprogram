package com.subrat.predicate;
import java.util.*;
import java.util.function.Predicate;

public class LoanEligibilityWithPredicate {
    
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter name");
    String name=sc.nextLine();
    System.out.println("enter salary");
    Double salary=Double.parseDouble(sc.nextLine());
    System.out.println(" enter creditscore");
    Integer creditScore=Integer.parseInt(sc.nextLine());
    System.out.println("enter age");
    Integer age=Integer.parseInt(sc.nextLine());
    Customer c=new Customer(name,salary,creditScore,age);
    boolean test=c.checkLoanEligibility();
    
    if (test) {
    	System.out.println(name+" eligible for loan");
    }
    else {
    	System.out.println(name+"not eligible for loan");
    }
	}
    record Customer(String name,Double salary,Integer creditScore,Integer age) {
	public boolean checkLoanEligibility() {
		Predicate<Customer>eligibility=cust->cust.salary()>25000 && cust.creditScore()>700 && cust.age()>21;
		return eligibility.test(this);
	}
}
}
