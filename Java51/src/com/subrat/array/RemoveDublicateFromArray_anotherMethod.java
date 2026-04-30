package com.subrat.array;

public class RemoveDublicateFromArray_anotherMethod {

	public static void main(String[]args) {
		int arr[]=new int[] {1,4,4,5,5,6,7};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					for(int k=j;k<n-1;k++) {
						arr[k]=arr[k+1];
					}
					j--;
					n--;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
