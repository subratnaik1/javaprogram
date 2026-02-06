package com.subrat.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	void main() {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		l1.stream()
		    .filter(num->num%2==0)
		          .forEach(IO::println);
	}
}
