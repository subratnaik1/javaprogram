package com.subrat.interface_;
import java.util.*;

     sealed interface Payment {
	 void makePayment(double amount);
	 void makeRefund(double amount);
	}
	non-sealed class CreditCardPayment implements Payment{
		private String cardHolderName ;
		
		CreditCardPayment(String cardHolderName){
			this.cardHolderName=cardHolderName;
		}
		 public void makePayment(double amount){
			System.out.println("Paid RS "+amount+"using Credit Card Holder :"+cardHolderName); 
		 }
		 public void makeRefund(double amount) {
			System.out.println("Cancelling order for amount RS :"+amount+" Refunded RS :"+amount+"to Credit Card Holder :"+cardHolderName); 
		 }
	}
	non-sealed class DebitCardPayment implements Payment {
		private String bankName; 
		 DebitCardPayment(String bankName){
			 this.bankName=bankName;
		 }
	     public void makePayment(double amount){
			System.out.println("Paid RS :"+amount+" using Debit Card Bank: State Bank of India"); 
		 }
		 public void makeRefund(double amount) {
			 System.out.println("Cancelling order for amount RS :"+amount+"Refunded RS :"+amount+" to Debit Card Bank: State Bank of India");
		 }
	}
	non-sealed class UpiPayment implements Payment{
		private String upiId;
		
		UpiPayment(String upiId){
			this.upiId=upiId;
		}
	 public void makePayment(double amount){
			 System.out.println("Paid RS "+amount+" using UPI ID : "+upiId);
		 }
		 public void makeRefund(double amount) {
			 System.out.println("Cancelling order for amount RS :"+amount+ "Refunded RS "+amount+" to UPI ID : "+upiId);
		 }
	}
	class ShoppingCart{
		private double totalAmount;
		ShoppingCart(double totalAmount){
			this.totalAmount=totalAmount;
		}
		public void checkout(Payment p) {
		System.out.println("Starting checkout for amount RS :"+totalAmount);
		if (p instanceof CreditCardPayment c) {
			c.makePayment(totalAmount);
			}		
		else if (p instanceof DebitCardPayment d) {
				d.makePayment(totalAmount);
		}
		else if (p instanceof UpiPayment u) {
			u.makePayment(totalAmount);
		}		
		}
		
		public void cancelOrder(Payment p) {
			System.out.println("Order Canceled. Initiating Refund...");
			if (p instanceof CreditCardPayment c) {
				c.makeRefund(totalAmount);
				}		
			else if (p instanceof DebitCardPayment d) {
					d.makeRefund(totalAmount);
			}
			else if (p instanceof UpiPayment u) {
				u.makeRefund(totalAmount);
			}		
			}
		}
	
	
public class Costumer {

	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter total bill amount:");
    double totalAmount=Double.parseDouble(sc.nextLine());
    System.out.println("Choose Payment Method:\n"+ "1. Credit Card\n"+ "2. Debit Card\n"+ "3. UPI");
    int choice=Integer.parseInt(sc.nextLine());
    
    Payment p;
    ShoppingCart spc=new ShoppingCart(totalAmount);
    
    if(choice==1) {
    System.out.println("enter card holder name");
    String cardHolderName=sc.nextLine();
    p=new CreditCardPayment(cardHolderName);  
    spc.checkout(p);
    spc.cancelOrder(p);
    }
    
    if(choice==2) {
        System.out.println("enter bank Name");
        String bankName=sc.nextLine();
        p=new  DebitCardPayment(bankName);  
        spc.checkout(p);
        spc.cancelOrder(p);
        }
    if(choice==3) {
        System.out.println("enter upi Id");
        String upiId=sc.nextLine();
        p=new  DebitCardPayment(upiId);  
        spc.checkout(p);
        spc.cancelOrder(p);
        }
	}
	

}
