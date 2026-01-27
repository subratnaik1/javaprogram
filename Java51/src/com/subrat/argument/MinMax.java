package com.subrat.argument;

public class MinMax {
void main() {
	int[] arr = {15, 3, 7, 22, 5, 9, 12};
	int min=arr[0] ;
	int max=arr[0];
		
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	IO.println(min);
	IO.println(max);
}
}
