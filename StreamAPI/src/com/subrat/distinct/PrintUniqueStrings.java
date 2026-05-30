package com.subrat.distinct;

import java.util.List;

public class PrintUniqueStrings {
public static void main(String[] args) {
	List<String>list=List.of("java","java","is","awsome");
	list.stream().distinct().forEach(IO::println);
}
}
