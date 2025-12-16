package com.subrat.argument;

import java.util.Scanner;

public class ArraysSelectionSortDes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<size;i++) {
			 arr1[i]=sc.nextInt();
		}
		int max;
		int temp;
		for(int i=0;i<size;i++) {
			max=i;
			for(int j=i+1;j<size;j++) {
				if(arr1[j]>arr1[i]) {
					max=j;
				}
			}
			temp=arr1[i];
			arr1[i]=arr1[max];
			arr1[max]=temp;
		}
		System.out.println(java.util.Arrays.toString(arr1));
	}

}
