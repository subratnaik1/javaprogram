package com.subrat.TrielAndError;

public class Pro {
	void main() {
		int num = 123211;
		String str = String.valueOf(num);
		boolean flag = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			IO.println("palindrome");
		} else {
			IO.println("not palindrome");
		}
	}
}
