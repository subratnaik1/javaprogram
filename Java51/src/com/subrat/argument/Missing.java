package com.subrat.argument;

import java.util.Scanner;
import java.util.Arrays;

public class Missing {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size");
	        int size=sc.nextInt();
	        int arr[]=new int[size];
	        
	        for(int i=0;i<size;i++) {
	        	arr[i]=sc.nextInt();	        			
	        }
	        Arrays.sort(arr);   
	        for(int i=arr[0];i<arr[size-1];i++) {
	        	boolean found=false;
	        	for(int j=0;j<size;j++) {
	        		if(arr[j]==i) {
	        			found=true;
	        			break;
	        		}        		
	        	}
	        	if(found==false) {
	        		System.out.println(i);        		
	        	}
	        }
	}
}
