package com.subrat.advancedLogicalQu;

import java.util.stream.IntStream;

public class CheckPalindrome {
public static void main(String[] args) {
	String s ="madam";
	Boolean palindrome=IntStream.range(0, s.length()/2)
	.allMatch(c->s.charAt(c)==s.charAt(s.length()-c-1));
	System.out.println(palindrome);
}
}
