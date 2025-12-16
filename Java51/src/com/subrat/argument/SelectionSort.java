package com.subrat.argument;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int size=sc.nextInt();
    int arr1[]=new int[size];
    for(int i=0;i<size;i++) {
    	arr1[i]=sc.nextInt();	
    }
    int min;
    int temp;
    for(int i=0;i<size;i++) {
    	min=i;
    	for(int j=i+1;j<size;j++) {
    	if(arr1[j]<arr1[min]) {
    		min=j;
    	}   	
    	}
    	temp=arr1[i];
    	arr1[i]=arr1[min];
    	arr1[min]=temp;   	
    }
    System.out.println(java.util.Arrays.toString(arr1));
	}
}
