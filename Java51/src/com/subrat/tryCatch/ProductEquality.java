package com.subrat.tryCatch;

public class ProductEquality {
void main() {
	Product p=new Product(11,"subrat");
	Product p1=new Product(11,"subrat");
	IO.println(p.equals(p1));
	IO.println(p.hashCode());
	IO.println(p1.hashCode());
	
}
}
    class Product {
	private int productId;
	private String productName;
	
	Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	public boolean equals(Object obj) {
		Product p=(Product)obj;
		if(this.productId==p.productId && this.productName==p.productName) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return this.productId;
	}
}
 
//Create an application to compare two objects based on the content by overriding the equals(Object obj) method of Object class.
//
//Create a BLC class called Product
//
//Instance variables :
//private int productId
//private String productName
//
//Create a parameterized constructor to initialize all properties.
//
//Override equals(Object obj) method from Object class to compare the content of Product object, 
//Make sure that if end user try to compare the content of two different objects (Product and Employee) 
//then program should provide proper message.
//
//Create an ELC class ProductEquality to test your application by creating two objects of 
//Product class to compare the content by calling Product class overridden equals(Object obj) method.
//
//Follow the equals() and hashCode() contract.
//
//------------------------------------------------------------------------------------------
//