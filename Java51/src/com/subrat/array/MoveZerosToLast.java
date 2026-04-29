package com.subrat.array;
import java.util.Arrays;
public class MoveZerosToLast {

	public static void main(String[]args) {
		int arr[]=new int[] {3,0,0,4,6,2,8};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];				
				j++;
			}						
		}
		while(j<arr.length) {
			arr[j]=0;
			j++;				
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
