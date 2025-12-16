package com.subrat.argument;

import java.util.Scanner;

public class ArrayBinarySearch {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int size=sc.nextInt();
    int arr[]=new int[size];
    
    for(int i=0;i<size;i++) {
    	arr[i]=sc.nextInt();
    }
    System.out.println("enter search number");
    int search=sc.nextInt();
    int low=0;
    int high=arr.length-1;
    int midVal=high+low/2;
    
    while(low<=high) {
    if(arr[midVal]==search) {
    	System.out.println("search is in index"+midVal);
    	break;
    }
    else if(arr[midVal]<search) {    	
    	low=midVal+1;
    }
    else {
    	high=midVal-1;
    }
    midVal=high+low/2;      
	}
	}

}
