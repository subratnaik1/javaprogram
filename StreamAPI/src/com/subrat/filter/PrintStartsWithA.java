package com.subrat.filter;

import java.util.List;

public class PrintStartsWithA {
public static void main(String[] args) {
	List<String> list=List.of("subrat","Aryan","Azad");
	list.stream().filter(str->str.contains("A")).forEach(IO::println);
}
}
