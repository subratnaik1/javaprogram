package com.subrat.argument;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	int arr1[]=new int[size];
	int arr2[]=new int[size];
	
	for(int i=0;i<size;i++) {
		arr1[i]=sc.nextInt();
	}
	for(int i=arr1.length-1;i>=0;i--) {
		System.out.print(arr1[i]+" ");
	}
}
}
