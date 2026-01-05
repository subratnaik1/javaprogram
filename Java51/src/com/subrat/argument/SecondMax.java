package com.subrat.argument;

public class SecondMax {
	void main() {
		int[] arr = { 12, 35, 1, 10, 34, 1 };
		int smax = 0;
		int fmax = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fmax) {
				fmax = arr[i];
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == fmax) {
					continue;
				}
				if (arr[j] > fmax) {
					smax = arr[j];
				}
			}
		}
		IO.println(smax);
	}
}
