package com.subrat.TrielAndError;

public class Practice {
	void main() {

		int arr[] = { 1, 4, 3, 5, 2, 6, 5 };
		int find = Integer.parseInt(IO.readln("enter Searching element"));
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				IO.println("element found at index " + i);
				flag = true;
				return;
			}
		}
		if (flag == false) {
			IO.println("Output: Element not found");
		}
	}
}