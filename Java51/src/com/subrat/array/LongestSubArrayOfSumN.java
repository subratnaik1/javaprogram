package com.subrat.array;

public class LongestSubArrayOfSumN {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 1, 2, 3, 1, 1, 3 };
		int num = 6;
		int maxlength = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];

				if (sum == num) {
					int length = j - i + 1;
					if(length>maxlength) {
						maxlength=length;
					}
				}

			}
		}
		System.out.println(maxlength);
	}
}
