package com.subrat.array;

import java.util.Arrays;

public class LeftRotateArrayByNthPlace {
public static void main(String[]args) {
	int arr[]=new int[] {3,5,3,6,7,8};
	int place=Integer.parseInt(IO.readln("enter no of places"));
	for(int i=0;i<place;i++) {
		int first=arr[0];
		for(int j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=first;
	}
	System.out.println(Arrays.toString(arr));
}
}
