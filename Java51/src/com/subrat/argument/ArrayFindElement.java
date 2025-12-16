package com.subrat.argument;

import java.util.Scanner;

public class ArrayFindElement {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
       System.out.println("enter size");
       int size=sc.nextInt();
       int arr1[]=new int[size];
       boolean flag=false;
 	   for(int i=0;i<size;i++) {
 		   arr1[i]=sc.nextInt(); 		   
 	   }
 	   System.out.println("find");
 	   int ele=sc.nextInt();
 	   
 	   for(int i=0;i<size;i++) {
 		   if(arr1[i]==ele) {
 			 System.out.println("found at index"+i); 
 			 flag=true;
 			 break;
 		   }
 		   if(flag=false) {
 			   System.out.println("not found");
 		   }
 		   
 	    }
        }	
        }


