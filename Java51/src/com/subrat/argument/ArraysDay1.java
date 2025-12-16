package com.subrat.argument;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysDay1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
	System.out.println("enter size of array");
	int size=sc.nextInt();
	int arr1[]=new int[size];
    
	for(int i=0;i<size;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr1));

   }
	}
