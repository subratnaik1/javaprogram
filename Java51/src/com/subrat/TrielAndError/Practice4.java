package com.subrat.TrielAndError;

public class Practice4 {
void main() {
	int arr[]= {1,2,3,4,5,6,7};
	IO.println("Even elemants are");
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			IO.println(arr[i]);
		}		
	}
	IO.println("odd elemants are");
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			IO.println(arr[i]);
		}		
	}
}
}
