package com.subrat.tryCatch;

public class CommandLineDivision {
	
void main(String args[]) {
	int divident=Integer.parseInt(args[0]);
	int divisor=Integer.parseInt(args[1]);
	try {
		for(int i=0;i<args.length;i++) {
			if(args.length>2||args.length<2) {
				throw new IllegalArgumentException();
			}			
		}
		try {
			int division=divident/divisor;
			IO.println("result"+division);
		}
		catch(ArithmeticException e){
			IO.println("Arithmetic error: / by zero");
		}
		finally {
			IO.println("Division operation completed.");
		}
		
	}
	catch(Exception e) {
		if(e instanceof IllegalArgumentException) {
			
		}
		if(e instanceof NumberFormatException) {
			
		}
		
	}
	
}
}

//Assignment : 03
//=================
//Command Line Division with Exception Handling
//
//Objective:
//Write a Java program that processes command line arguments, handles exceptions for invalid inputs and division by zero, 
//and demonstrates the use of nested try-catch blocks with a finally block for cleanup.
//
//Instructions:
//-------------
//
//-> Create a ELC class named CommandLineDivision.
//
//-> Implement the main method that:
//   Checks if exactly two command line arguments are provided.
//   Parses these arguments into integers (dividend and divisor).
//   Uses nested try-catch blocks:
//   Outer block catches IllegalArgumentException for insufficient arguments or invalid input types (NumberFormatException).
//   Inner block attempts the division and catches ArithmeticException for division by zero.
//   Prints the result of the division if successful.
//   Includes a finally block to print "Division operation completed."
//
//-> Test the program with different scenarios:
//   a) Provide valid integers for division.
//   b) Test division by zero scenario.
//   c) Test with invalid input types (non-integer values).
//
//
//TEST CASE 1 : 
//-------------
//CommandLine Inputs : java CommandLineDivisionQuestion 10 2
//Expected Output:
//Division result: 5.0
//Division operation completed.
//
//
//TEST CASE 2 : 
//-------------
//CommandLine Inputs : java CommandLineDivisionQuestion 8 0
//Expected Output:
//Arithmetic error: / by zero
//Division operation completed.
//
//
//TEST CASE 3 : 
//-------------
//CommandLine Inputs : java CommandLineDivisionQuestion 12 abc
//Expected Output:
//NumberFormatException: For input string: "abc"
//Division operation completed.
