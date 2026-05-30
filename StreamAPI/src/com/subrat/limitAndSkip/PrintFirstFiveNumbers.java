package com.subrat.limitAndSkip;

import java.util.List;

public class PrintFirstFiveNumbers {
public static void main(String[] args) {
	List<Integer>list=List.of(3,4,5,6,7,5,8);
	list.stream().limit(5).forEach(IO::println);
}
}
