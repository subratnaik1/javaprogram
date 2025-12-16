package com.subrat.argument;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int size1=sc.nextInt();
 int arr1[]=new int[size1];
 System.out.println("enter array2 size");
 int size2=sc.nextInt();
 int arr2[]=new int[size2];
 int res[]=new int[arr1.length+arr2.length];
 
 System.out.println("enter elements of first array");
 for(int i=0;i<size1;i++) {
	 arr1[i]=sc.nextInt();
 }
 System.out.println("enter elements of second array");
 for(int i=0;i<size2;i++) {
	 arr2[i]=sc.nextInt();
 }
for(int i=0;i<arr1.length;i++) {
	res[i]=arr1[i];
}
for(int i=0;i<arr2.length;i++) {
	res[arr1.length+i]=arr2[i];
}
System.out.println(java.util.Arrays.toString(res));

java.util.Arrays.sort(res);
System.out.println(java.util.Arrays.toString(res));
}
	
}
