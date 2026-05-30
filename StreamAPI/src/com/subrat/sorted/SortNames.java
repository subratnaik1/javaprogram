package com.subrat.sorted;

import java.util.List;

public class SortNames {
	public static void main(String[] args) {
		List<String> list = List.of("a","B","d","c");
		list.stream().sorted((s1,s2)->s1.compareToIgnoreCase(s2)).forEach(IO::println);
	}
}
