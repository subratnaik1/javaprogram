package com.subrat.advancedLogicalQu;

public class FirstRepetingChar {
	public static void main(String[] args) {
		String s = "Hello World";
		Character orElse = s.chars().mapToObj(c -> (char) c).filter(c -> s.indexOf(c) != s.lastIndexOf(c)).findFirst()
				.orElse(null);
		System.out.println(orElse);
	}
}
