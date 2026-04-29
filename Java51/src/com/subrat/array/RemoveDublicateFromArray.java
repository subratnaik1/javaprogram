package com.subrat.array;

public class RemoveDublicateFromArray {

	public static void main(String[]args) {
		int arr[]=new int[] {4,4,5,5,3,2,3};
		for(int i=0;i<arr.length;i++) {
			boolean unique=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					unique=false;
					break;					
				}
			}
			if(unique) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
