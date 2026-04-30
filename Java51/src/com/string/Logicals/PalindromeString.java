package com.string.Logicals;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "ababa";
		boolean palindrome = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				palindrome = false;
			}
		}
		if (!palindrome) {
			System.out.println("not palindrome");
		}
		else {
			System.out.println("palindrome");
		}
	}

}
