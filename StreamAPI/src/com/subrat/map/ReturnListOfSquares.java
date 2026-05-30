package com.subrat.map;

import java.util.List;
import java.util.stream.Collectors;

public class ReturnListOfSquares {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		list.stream().map(i -> i * i).collect(Collectors.toList()).forEach(IO::println);
	}
}
