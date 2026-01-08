package com.subrat.collections;

import java.util.ArrayList;

record Customer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
		String phone) {

	Customer{
		if(custId<=0) {
			throw new IllegalArgumentException("Customer Id must be positive");
		
		}
		else if(customerName==null || customerName.isBlank()) {
			throw new IllegalArgumentException("Customer name cannot be null or blank.");
			
		}
		else if(pickupLocation==null || pickupLocation.isBlank()) {
			throw new IllegalArgumentException("Pickup location cannot be null or blank.");
		
		}
		else if(dropLocation==null || dropLocation.isBlank()) {
			throw new IllegalArgumentException("Drop location cannot be null or blank");
			
		}
		else if(distance<0) {
			throw new IllegalArgumentException("Validation Error: Distance cannot be negative.");
		
		}
		else if(phone.length()!=10) {
			throw new IllegalArgumentException(" Phone number must be 10 digits only.");
		}
	}
}
class CustomerService{
	
	private ArrayList<Customer> customers  ;
	
	CustomerService(){
		 customers = new ArrayList<>();
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	private boolean  isFirstCustomer(Customer customer) {
		boolean flag=false;
		for(Customer c:customers) {
			if(c.phone().contains(customer.phone())) {
				flag=true;
			}
		}
		if(flag) {
			return true;
		}
		else {
			return false;
		}		
	}
	public double calculateBill(Customer customer) {
		
			if(isFirstCustomer(customer)) {
				return 0;
			}
			else if(customer.distance()<=4) {
				return 80;
			}
			else  {
				return 80+(customer.distance()-4)*6;
			}	
	}
	public void printBill(Customer customer) {
		IO.println(customer.customerName()+" Please pay your bill of Rs. "+calculateBill(customer));
	}
}
public class CabCustomerServiceTester {
	void main() {
		int custId=Integer.parseInt(IO.readln("enter customer id"));
		String customerName=IO.readln("enter customer name");
		String pickupLocation=IO.readln("enter pickup location");
		String dropLocation=IO.readln("enter drop location");
		int distance=Integer.parseInt(IO.readln("enter distance"));
		String phone=IO.readln("enter phone number");
		CustomerService cs=new CustomerService();
		try {		
			Customer c=new Customer(custId,customerName,pickupLocation,dropLocation,distance,phone);
			cs.printBill(c);
			cs.addCustomer(c);
		}
		catch(IllegalArgumentException e) {
			IO.println(e.getMessage());
		}
	}
}
