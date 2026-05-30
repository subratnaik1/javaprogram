package com.subrat.distinct;

import java.util.List;

public class removedublicateNumbersFromList {
public static void main(String[] args) {
	List<Integer>list1=List.of(1,2,3,4,4,3,3);
	list1.stream().distinct().forEach(IO::println);
}
}
