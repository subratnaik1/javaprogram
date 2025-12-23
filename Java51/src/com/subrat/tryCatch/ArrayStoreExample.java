package com.subrat.tryCatch;

import java.util.Scanner;

public class ArrayStoreExample {

	public static void main(String[] args) {
		storeObjects();
	}
    public static void storeObjects() {
   	Scanner sc=new Scanner(System.in);
   	
    	Object obj[]=new String[5];
    	try(sc) {
    		for(int i=0;i<=5;i++) {
    			IO.println("enter value");
    			String s=sc.nextLine();
    			if(s.matches("\\d+")) {
    				obj[i]=Integer.parseInt(s);
    			}
    			else {
    				obj[i]=s;
    			}
    		} 		
    	}
    	catch(ArrayStoreException e) {
    		IO.println("ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String");
    	}
	
}
}
//Assignment : 2
//===============
//Handling ArrayStoreException in Java
//
//Objective:
//Write a Java program that demonstrates how to handle ArrayStoreException. 
//The program should include a method that attempts to store objects of incompatible types into an array of String[]. 
//Implement exception handling in the main method to catch and handle this exception.
//
//Instructions:
//-------------
//
//-> Create a class named ArrayStoreExample:
//
//-> Implement a static method storeObjects that:
//
//   Method name : storeObjects
//   Access modifiers : public
//   Non-Access modifier : static
//   Return type : void
//
//   Initializes an Object array of type String[] with a size of 5.
//   Attempts to store objects of different types (String, Integer, etc.) into the array using array indexing.
//   Throws an ArrayStoreException if an attempt is made to store an object that is not compatible with String.
//
//-> Implement the main method:
//
//   Inside the main method, call the storeObjects method with different objects, including objects of incompatible types.
//   Use a try-catch block to catch and handle any ArrayStoreException thrown by storeObjects method.
//   Print an appropriate error message when an incompatible object type is attempted to be stored in the array.
//
//
//TEST CASE 1 :
//-------------
//Store objects of different types in the array
//      strings[0] = "Hello";   // Storing a String
//      strings[1] = "World";   // Storing another String
//      strings[2] = "Java";    // Storing another String
//Output as :
//Objects stored successfully.
//
//TEST CASE 2 :
//-------------
//
//Store objects of different types in the array
//      strings[0] = "Hello";   // Storing a String
//      strings[1] = "World";   // Storing another String
//      strings[2] = 123;       // Trying to store an Integer in a String array
//
//Output as :
//ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String