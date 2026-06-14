package com.subrat.array;

import java.util.Arrays;

public class moveAllZerosToLast {
public static void main(String[] args) {
	int arr[]= {1,0,3,4,0,8};
	int index=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[index++]=arr[i];
		}		
	}
	while(arr.length>index) {
		arr[index++]=0;
	}
	System.out.println(Arrays.toString(arr));

}
}
