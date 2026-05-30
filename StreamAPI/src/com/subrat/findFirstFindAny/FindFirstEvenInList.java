package com.subrat.findFirstFindAny;

import java.util.List;
import java.util.Optional;

public class FindFirstEvenInList {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		Optional<Integer> first = list.stream().filter(i -> i % 2 == 0).findFirst();
		System.out.println(first.get());
	}
}
