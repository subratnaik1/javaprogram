package com.subrat.argument;

public class Dublicate {
	void main() {
		int[] arr = { 1, 2, 3, 4, 2, 5, 3 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;				
				}		
		}
			if(count>1) {
				IO.println(arr[i]);
			}
	}
}}
