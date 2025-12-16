package com.subrat.argument;

import java.util.Scanner;
import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("delete");
    int delete=sc.nextInt();
    for(int i=0;i<size;i++) {
    	if(arr[i]==delete) {
    		for(int j=i;j<size-1;j++) {
    			arr[j]=arr[j+1];    			
    		}
    		size--;
    		break;
    	}
    	
    }
    
//    for(int i = 0; i< size; i++) {
//    	if(arr[i] != delete) {
//    		arr1[k++] = arr[i];
//    	}
//    }
	System.out.println(Arrays.toString(arr));
	}

}
