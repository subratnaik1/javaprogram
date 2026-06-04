package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.List;

public class PrintOnlyDigitFromArray {
	public static void main(String[] args) {
		 String [] s = {"abc", "123", "456", "xyz"};
		List<Integer>list= Arrays.stream(s)
		 .filter(str->str.chars().allMatch(c->Character.isDigit(c)))
		.map(str->Integer.parseInt(str))
		.toList();
		
		System.out.println(list);
	}
}
