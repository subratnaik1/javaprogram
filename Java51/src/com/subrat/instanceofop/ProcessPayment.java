package com.subrat.instanceofop;
class Payment{

	public void processPayment() {
		System.out.println("Processing payment");
	}
}
class CreditCardpayment extends Payment{
	
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
}
class DebitCardpayment extends Payment{
	
	public void processPayment() {
		System.out.println("Processing Debit Card payment");
	}
}
class UPIPayment extends Payment{
	public void processPayment() {
		System.out.println("Processing UPI payment");
	}	
}
public class ProcessPayment {

	public static void main(String[] args) {
		Payment p=new  CreditCardpayment();
		Payment p1=new DebitCardpayment();
		Payment p2=new UPIPayment();
		
		paymentGateway(p,p1,p2);
		
}
	 public static void paymentGateway(Payment... payments) {
			for(Payment p:payments) {
				p.processPayment();
			}
		}	
}
