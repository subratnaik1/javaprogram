package com.subrat.argument;

import java.util.Scanner;

public class ArrayMiddleElement {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int size=sc.nextInt();
    int arr1[]=new int[size];
    
    for(int i=0;i<size;i++) {
    	arr1[i]=sc.nextInt();  	
    }
   
    	if(size%2==0) {
    		
   		System.out.print(arr1[arr1.length/2]-1);
   		System.out.print(arr1[arr1.length/2]);
   		
    	}
    	else {
    		System.out.println(arr1[arr1.length/2]);
    	}
    }
	}


