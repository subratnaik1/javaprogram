package com.subrat.StreamAPI;

import java.util.stream.Stream;

public class C {
	void main() {
		Integer arr[]= {9,8,0,7,5,3,2,1};
		Stream.of(arr).sorted((a,b)->b.compareTo(a))
		.forEach(IO::println);
	}
}
