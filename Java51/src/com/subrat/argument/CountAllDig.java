package com.subrat.argument;

import java.util.Scanner;

public class CountAllDig {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++) {
		int num=arr[i];
		int count=0;
		for(int j=0;j<size;j++) {
			while(num>0) {		
				count++;
				num=num/10;
			}
		}
		System.out.println("digit "+arr[i]+"times"+count);
	}

	}

}
