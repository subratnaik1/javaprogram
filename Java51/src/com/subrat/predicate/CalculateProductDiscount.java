package com.subrat.predicate;

import java.util.function.Function;

public class CalculateProductDiscount {

	record Product(Integer id,String name,Double price) {
	}	
	public static void main(String[] args) {
	Integer id=Integer.parseInt(IO.readln("enter product Id"));
	String name=IO.readln("enter product name");
	Double price=Double.parseDouble(IO.readln("enter product price"));
	Product p=new Product(id,name,price);
    Function<Product ,Double>discount=v1->{
    	if(v1.price>=5000) {
    		return v1.price-0.10*v1.price;
    	}
    	else { 
        	return v1.price-05*v1.price;
    	}    
	};
	IO.println("Final price of the product is :"+discount.apply(p));
}
}
	
//Assignment 01 :
//----------------------
//Develop a scenario based program by using Functional interface to provide some discount on the Product on this Winter season.
//
//Coding Requirement :
//--------------------
//Create a record called Product.
//
//Components :
//------------
// id : Integer
// name : String
// price : Double
//
//Take an ELC class CalculateProductDiscount with main method.
//In this create a Function<T,R> functional interface which will take Product as a input parameter and will return discounted price on the following criteria :
//
//a) 10% discount on Product price, If product price is greater then OR equal 
//   to 5000.
//b) 5% discount on Product price, If product price is less then 5000.
//
//Note : The Function<T,R> should return the final price that means discounted price. [price - discount].
//
//Take the Product data as a input from the user using IO class
//and print the following deatils given in the test cases.
//
//Test Case for Output :
//----------------------
//Test case 01 :
//--------------
//Enter Product Id :101
//Enter Product Name :Laptop
//Enter Product Price :50000
//Final price of the product is :45000.0
//
//Test case 02 :
//--------------
//Enter Product Id :102
//Enter Product Name :Head Phone
//Enter Product Price :4000
//Final price of the product is :3800.0
