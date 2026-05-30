package com.subrat.map;

import java.util.List;

public class ListToString {
public static void main(String[] args) {
	List<Integer> list=List.of(1,2,3,4);
	list.stream().map(i->String.valueOf(i)).forEach(IO::println);
}
}
