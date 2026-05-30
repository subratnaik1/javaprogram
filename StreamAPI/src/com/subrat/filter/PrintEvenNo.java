package com.subrat.filter;

import java.util.List;
import java.util.stream.Stream;

public class PrintEvenNo {
public static void main(String[] args) {
	List<Integer> list=List.of(1,2,3,4,5);
	 list.stream().filter(num->num%2==0).forEach(IO::println);
	
	
}
}
