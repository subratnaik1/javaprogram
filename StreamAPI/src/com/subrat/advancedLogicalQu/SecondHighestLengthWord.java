package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.Optional;

public class SecondHighestLengthWord {
	public static void main(String[] args) {
		String str = "I am learning streams API in Java";
		Optional<String> first = Arrays.stream(str.split(" ")).distinct().sorted((s1, s2) -> s2.length() - s1.length())
				.skip(1).findFirst();
		IO.print(first.get().length());
	}
}
