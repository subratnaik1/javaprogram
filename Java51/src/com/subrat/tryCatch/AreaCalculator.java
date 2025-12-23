package com.subrat.tryCatch;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double length=Double.parseDouble(IO.readln("enter leangth"));
    double bredth=Double.parseDouble(IO.readln("enter bredth"));
    calculateArea(length,bredth);
    
	}
	public static double calculateArea(double length,double bredth) {
		
			double area= length*bredth;
			if(length<=0||bredth<=0) {
				throw new IllegalArgumentException("either length or width is less than zero.");
			}
			else {
				IO.println("Area of rectangle with length "+length+" and width "+bredth+" is: "+area);
				return area;
			}
		
	}

}
//Assignment : 01
//===============
//
//Rectangle Area Calculation with Exception Handling
//
//Objective:
//Design and implement a Java program to calculate the area of a rectangle. 
//The program should incorporate exception handling to validate user input and throw an IllegalArgumentException when invalid dimensions are provided.
//
//Instructions:
//-------------
//
//-> Create a class named AreaCalculator:
//
//-> Implement a static method calculateArea :
//   Takes two integer parameters: length and width.
//   Access Modifier : public
//   Non-Access Modifier : static
//   return type : double
//   parameters : double, double
//
//-> Calculates the area using the formula length * width.
//   Throw an IllegalArgumentException if either length or width is less than zero.
//
//-> Implement the main method:
//   Inside the main method, use a Scanner object to read input from the user.
//   Prompt the user to enter the length and width of the rectangle.
//
//-> Call the calculateArea method within a try-catch block to handle any IllegalArgumentException.
//   Print the area of the rectangle if dimensions are valid; otherwise, print an error message.
//
//
//TEST CASE 1 :
//-------------
//Input:
//Enter length of rectangle: 5
//Enter width of rectangle: 4
//
//Output:
//Area of rectangle with length 5 and width 4 is: 20.0
//
//
//TEST CASE 2 :
//-------------
//Input:
//Enter length of rectangle: -5
//Enter width of rectangle: 4
//
//Output:
//Error: Length and width must be > 0.
//
//
//TEST CASE 3 :
//-------------
//Input:
//Enter length of rectangle: 5
//Enter width of rectangle: 0
//
//Output:
//Error: Length and width must be > 0.
//
