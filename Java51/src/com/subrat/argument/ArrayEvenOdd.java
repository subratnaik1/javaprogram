package com.subrat.argument;

import java.util.Scanner;


public class ArrayEvenOdd {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int size=sc.nextInt();
    int arr1[]=new int[size];
    for(int i=0;i<size;i++) {
    	arr1[i]=sc.nextInt();
    }
    System.out.print("even element are");
    for(int i=0;i<size;i++) {
      if(arr1[i]%2==0) {
    		System.out.print(arr1[i]+" ");
    	}
    }
    System.out.println();
    System.out.print("odds element are");
    for(int i=0;i<size;i++) {
    	if(arr1[i]%2!=0) {
    		System.out.print(arr1[i]+" ");
    	}
    }
    
	}

}
