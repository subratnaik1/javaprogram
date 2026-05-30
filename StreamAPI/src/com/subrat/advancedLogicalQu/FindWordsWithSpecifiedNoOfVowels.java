package com.subrat.advancedLogicalQu;

import java.util.Arrays;

public class FindWordsWithSpecifiedNoOfVowels {
	public static void main(String[] args) {
		String str = "I am learning streams API in Java";
		Arrays.stream(str.split(" ")).filter(w->w.toLowerCase().chars().filter(ch->"aeiou".indexOf(ch)>=0).count()==2).forEach(IO::println);
	}
}
