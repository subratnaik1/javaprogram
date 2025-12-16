package com.subrat.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

record Car(String brand,Double price,Integer milage) {	
}
public class CarSelling {

   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter brand name");
   String brand=sc.nextLine();
   System.out.println("enter price");
   Double price=Double.parseDouble(sc.nextLine());
   System.out.println("enter milage");
   Integer milage=Integer.parseInt(sc.nextLine());
   Car c=new Car(brand,price,milage);
   
   Predicate<Car>c1=checkPrice->price<=500000 && milage>=20;
   boolean test=c1.test(c);
   if(test) {
	System.out.println(c.brand()+" is eligible for sale");   
   }
   else {
	   System.out.println(c.brand()+" is not eligible for sale");   
   }
   }
   
   }
//Assignment 01 :
//---------------
//Write a Java program that defines a method testPredicate to test a given number against a provided predicate.
//class name CalculationLogic(ELC) :
//
//Method name : testPredicate
//Access Modifier : public
//Non-Access Modifier : static
//return type : boolean
//parameters : int, Predicate<Integer>
//This method should return a boolean value indicating whether the given number satisfies the provided predicate.
//
//
//In the main method:
//Define three predicates:
//isEven: Checks if a given number is even.
//isGreaterThanTen: Checks if a given number is greater than 10.
//isPrime: Verify the given number is prime or not.
//
//Define a sample integer number (e.g., 18).
//Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.
//
//Test Cases:
//
//Test case 1 : Sample Number (18):
//18 is even: true
//18 is greater than 10: true
//18 is prime: false
//
//Test Case 2:
//
//For number1 = 6:
//6 is even: true
//6 is greater than 10: false
//6 is prime: false
//
//Test Case 3:
//For number2 = 17:
//17 is even: false
//17 is greater than 10: true
//17 is prime: true
//
//
