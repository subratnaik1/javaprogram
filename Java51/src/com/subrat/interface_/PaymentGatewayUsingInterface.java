package com.subrat.interface_;

import java.util.Scanner;

interface Payments{
	 void processPayment() ;
	 void applyDiscount();
	
}
class CreditCardPayments implements Payments{
	public void processPayment() {
		System.out.println("Processing Credit Card payment...");
	}
	public void	applyDiscount() {
		System.out.println("Applying 10% discount for Credit Card payment");
	}
}
class UPIPayments implements Payments{
    public void processPayment() {
		System.out.println("Processing UPI payment... ");
	}
	public void	applyDiscount() {
		System.out.println("Applying 5% discount for UPI payment");

	}
}
class PaymentGateway{
	public Payments initiatePayment(String paymentType) {
		Payments p=null;
		if(paymentType.equalsIgnoreCase("CreditCard")) {
			System.out.println("Initiating Credit Card payment");
			p=new CreditCardPayments();
			p.processPayment();
			p.applyDiscount();
		}
		else if(paymentType.equalsIgnoreCase("UPI")) {
			System.out.println("Initiating UPI payment");
			p=new UPIPayments();
			p.processPayment();
			p.applyDiscount();
	    }
		else {
			System.out.println("invalid input");
			System.exit(0);
		}
		return p;
}
public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Payment Type [CreditCard / UPI]:");
    String choice=sc.nextLine();
    PaymentGateway p=new PaymentGateway(); 
    p.initiatePayment(choice);
	}
	

}
}
