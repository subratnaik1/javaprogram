package com.subrat.count;

import java.util.List;

public class CountNameStartsWithA {
public static void main(String[] args) {
	List<String>list=List.of("Azaad","Subrat","Rahul");
	long count = list.stream().filter(str->str.startsWith("A")).count();
	System.out.println(count);
}
}
