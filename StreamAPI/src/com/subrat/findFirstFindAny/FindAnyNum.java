package com.subrat.findFirstFindAny;

import java.util.List;
import java.util.Optional;

public class FindAnyNum {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		Optional<Integer> any = list.stream().findAny();
		System.out.println(any.get());
	}

}
