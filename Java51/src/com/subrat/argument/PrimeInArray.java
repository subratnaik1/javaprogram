package com.subrat.argument;

import java.util.Scanner;

public class PrimeInArray {
    
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in) ;
  	   System.out.println("enter size");
  	   int size=sc.nextInt();
  	   int arr[]=new int[size];
  	   for(int i=0;i<size;i++) {
  		   arr[i]=sc.nextInt();
  	   }
  	 for(int i=0;i<size;i++) {
  		 int count=0;
  		 for(int j=2;j<=arr[i]/2;j++) {
  			 if(arr[i]%j==0){
  				count++;
  				 break;
  			 }
  		 }
  		 if(count==0) {
  			 System.out.println("prime number"+arr[i]);
  		 }
  	 }
   

	}

}
