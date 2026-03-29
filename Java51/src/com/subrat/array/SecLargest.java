package com.subrat.array;

public class SecLargest {

	void main() {
		int arr[] = new int[Integer.parseInt(IO.readln("enter size").trim())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(IO.readln().trim());
		}
		int firstMax = 0;
		int secMax = 0;
		for (int i = 0; i < arr.length; i++) {   
             if(arr[i]>arr[firstMax]) {
            	 firstMax=i;
             }
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr[firstMax] && arr[i]>arr[secMax]) {
				secMax=i;
			}
		}
		IO.println("second max number = "+arr[secMax]);
	}
}
