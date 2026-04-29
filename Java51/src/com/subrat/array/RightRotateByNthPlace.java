package com.subrat.array;

import java.util.Arrays;

public class RightRotateByNthPlace {
public static void main(String[]args) {
	int arr[]=new int[] {3,6,1,6,8,6};
	int place=Integer.parseInt(IO.readln("enter place to rotate"));
	for(int i=0;i<place;i++) {
		int first=arr[arr.length-1];
		for(int j=arr.length-1;j>0;j--) {
			arr[j]=arr[j-1];
		}
		arr[0]=first;
	}
	System.out.println(Arrays.toString(arr));
}
}
