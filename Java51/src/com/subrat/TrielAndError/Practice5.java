package com.subrat.TrielAndError;

public class Practice5 {
	void main() {
		int arr[]= {1,2,3,4,5};
		if(arr.length%2!=0) {
			IO.println(arr[arr.length/2]);
			return;
		}
		if(arr.length%2==0) {
			IO.println(arr[arr.length/2]);
			IO.println(arr[arr.length/2+1]);
			return;
		}
	}
		
}
