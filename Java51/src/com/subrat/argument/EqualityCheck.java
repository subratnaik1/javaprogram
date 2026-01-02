package com.subrat.argument;

public class EqualityCheck {
void main() {
	
	int[] arr1 = {1, 2, 3, 4};
	int[] arr2 = {1, 2, 3, 4};

	boolean flag=false;
	if(arr1.length==arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr2.length) {
				flag=true;	
				}
			}
		}
		IO.println("Arrays are equal");
	}
	else{
		IO.println("not equal");
	}
}
}
