package com.subrat.array;

public class Check_if_non_Decresing_or_not {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 5, 3, 4, 5 };
		boolean increasing = true;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					increasing=false;
					break;
				}
			}
		}
		if(!increasing) {
			System.out.println("false");			
		}
		else {
			System.out.println("true");			

		}
	}
}
