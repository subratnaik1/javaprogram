package com.subrat.inharitance;

import java.util.Scanner;

public class ShoppingMall {
	public static void main(String[]args){
	     Scanner sc=new Scanner(System.in);
	     int choice=Integer.parseInt(sc.nextLine());
	      String name=sc.nextLine();
	      int totItem =Integer.parseInt(sc.nextLine());
	      double prices[]=new double[totItem];
	      for(int i=0;i<totItem;i++){
	        String itemName=sc.nextLine();
	       double price=Double.parseDouble(sc.nextLine());
	        prices[i]=price;
	      }
	      Costomer c;
	      if(choice==1){
	       c=new GeneralCustomer(name);
	       generateBill(c,prices);
	      } 
	      else if(choice==2){
	       c=new PrimeCostomer(name);
	       generateBill(c,prices);
	      } 
	      else if(choice==3){
	       c=new VIPCustomer(name);
	       generateBill(c,prices);
	      } 

	      
	    }
	    public static void generateBill(Costomer cust,double... prices){
	        cust.calculateBill(prices);
	    }

	}
	class Costomer{
	protected String name;

	Costomer(String name){
	  this.name=name;  
	}
	public void calculateBill(double... prices){

	}

	}
	class GeneralCustomer extends Costomer{
	GeneralCustomer(String name){
	    super(name);
	}
	public void calculateBill(double... prices){
	double sum=0;
	for(double pr:prices){
	    if(pr<0){
	        System.out.println("Item price cannot be negative.");
	        System.exit(0);
	    }
	     sum=sum+pr;
	}
	System.out.println("Welcome to Hyderabad Mall :");
	System.out.println("Customer: "+name);
	System.out.println("Total cost RS : "+sum);
	System.out.println("Discount: No discount for general customers.");
	}
	}

	class PrimeCostomer extends Costomer{
	protected double discountRate=10.0;
	PrimeCostomer(String name){
	    super (name);
	}
	public void calculateBill(double... prices){
	double sum=0;
	for(double pr:prices){
	    if(pr<0){
	        System.out.println("Item price cannot be negative.");
	        System.exit(0);
	    }
	      sum=sum+pr;
	}
	double da=sum*discountRate/100;
	double fp=sum-da;
	System.out.println("Welcome to Hyderabad Mall :");
	System.out.println("Customer: "+name);
	System.out.println("Total cost RS : "+sum);
	System.out.println("Discount RS : "+da);
	System.out.println("Final amount RS : "+fp);
	}
	}

	class VIPCustomer extends Costomer{
	protected double Rate=15.0;
	 VIPCustomer(String name){
	    super(name);
	}
	public void calculateBill(double... price){

	double sum=0;
	for(double pr:price){
	    if(pr<0){
	        System.out.println("Item price cannot be negetive.");
	        System.exit(0);
	    }
	    sum=sum+pr;
	}
	double da=sum*Rate/100;
	double fp=sum-da;
	System.out.println("Welcome to Hyderabad Mall :");
	System.out.println("Customer: "+name);
	System.out.println("Total cost RS : "+sum);
	System.out.println("Discount RS : "+da);
	System.out.println("Final amount RS : "+fp);
	}

}
