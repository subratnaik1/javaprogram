package com.subrat.inharitance;

import java.util.*;
public class BankAccountPOlymorph {
	public class BankApplication{
	    public static void main(String []args){
	        Scanner sc=new Scanner(System.in);
	        int choice=sc.nextInt();
	        BankAccount b;
	        b=new SavingsAccount(accountHolderName,AccountNumber,balance);
	        if(choice==1){
	            String accountHolderName=sc.next();
	            String AccountNumber=sc.next();
	            double balance=sc.nextDouble();

	            b.displayAccountDetails();
	            b.calculateInterest();
	        }
	        if(choice==2){
	            String accountHolderName=sc.next();
	            String AccountNumber=sc.next();
	            double balance=sc.nextDouble();

	            b =new CurrentAccount(accountHolderName,AccountNumber,balance);
	            b.displayAccountDetails();
	            b.calculateInterest();
	            CurrentAccount c=(CurrentAccount)b;
	            c.checkOverDeaftLimit();
	        }
	        if(choice==3){
	            String accountHolderName=sc.next();
	            String AccountNumber=sc.next();
	            double balance=sc.nextDouble();
	            sc.nextLine();
	            int depositTerm=sc.nextInt();
	            b=new FixedDepositAccount(accountHolderName,AccountNumber,balance,depositTerm);
	            b.displayAccountDetails();
	            b.calculateInterest();
	        }
	    }
	}
	class BankAccount{
	    protected String accountHolderName;
	    protected String AccountNumber;
	    protected double balance;
	    public static final String IFSC_CODE="SBIHYD151285";

	    BankAccount(String accountHolderName,String AccountNumber,double balance){
	        this.accountHolderName=accountHolderName;
	        this.AccountNumber=AccountNumber;
	        if(balance<0){
	            IO.println("Balance cannot be negative.");
	            System.exit(0);
	        }          
	        else{
	        this.balance=balance;      
	        }
	    }
	    public void displayAccountDetails(){
	    IO.println("Account Holder: "+ this.accountHolderName);
	    IO.println("Account Number: "+this.AccountNumber);
	    IO.println("Balance RS :"+this.balance);
	    IO.println("IFSC CODE :"+this.IFSC_CODE);
	    }
	    public void calculateInterest(){
	    double interest=balance;
	    }
	}
	class SavingsAccount extends BankAccount{
	    protected double interestRate=4.0;
	    SavingsAccount(String accountHolderName,String AccountNumber,double balance){
	        super(accountHolderName,AccountNumber,balance);
	    }
	    public void calculateInterest(){
	    double interest=balance*interestRate/100;
	    IO.println("Savings Account Interest RS :"+interest);
	    } 

	}
	class CurrentAccount extends BankAccount{
	    protected double overDraftLimit=5000.0;
	    CurrentAccount(String accountHolderName,String AccountNumber,double balance){
	        super(accountHolderName,AccountNumber,balance);
	    }
	    public void calculateInterest(){
	    IO.println("Current accounts do not earn interest.");
	    }
	    public void checkOverDeaftLimit(){
	     IO.println("Overdraft limit RS :"+this.overDraftLimit);
	    }
	}
	class FixedDepositAccount extends BankAccount{
	    protected double interestRate=6.5;
	    protected int depositTerm;

	    FixedDepositAccount(String accountHolderName,String AccountNumber,double balance,int depositTerm){
	    super(accountHolderName,AccountNumber,balance);
	    if(depositTerm<0){
	        IO.println("Deposit term must be positive.");
	        System.exit(0);
	    }
	    else{
	    this.depositTerm=depositTerm;
	    }
	    }
	    public void calculateInterest(){
	    double intrest=balance*interestRate*depositTerm/100;
	    IO.println("Fixed Deposit Interest for 5 years RS :"+intrest);
	    }
	}

}
