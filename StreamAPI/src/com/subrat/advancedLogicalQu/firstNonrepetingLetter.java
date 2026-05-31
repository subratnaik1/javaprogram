package com.subrat.advancedLogicalQu;

public class firstNonrepetingLetter {
	public static void main(String[] args) {
		String s = "Hello World";
	Character ch=s.chars()
		.mapToObj(c->(char)c)
		.filter(c->s.indexOf(c)==s.lastIndexOf(c))
		.findFirst().orElse(null);
		System.out.println(ch);
}
}