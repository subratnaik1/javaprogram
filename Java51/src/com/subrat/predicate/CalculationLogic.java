package com.subrat.predicate;

import java.util.Scanner;
import java.util.function.Predicate;


public class CalculationLogic {
	public static void main(String[] args) {
		System.out.println("enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    Predicate<Integer> isEven=v1->v1%2==0;
    Predicate<Integer> isGreater=v1->v1>10;
    Predicate<Integer> Isprime=v1->{
    	int count=0;
    	for(int i=1;i<=v1;i++) {
    		if(v1%i==0) {
    			count++;
    		}
    	}
    		if(count==2) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	  	
    };
    System.out.println(testPredicate(n,isEven));
    System.out.println(testPredicate(n,isGreater));
    System.out.println(testPredicate(n,Isprime));
	}
	public static boolean testPredicate(int a, Predicate<Integer> b) {
		return b.test(a);
	}
}
