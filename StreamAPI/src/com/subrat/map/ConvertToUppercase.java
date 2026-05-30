package com.subrat.map;

import java.util.List;

public class ConvertToUppercase {
	public static void main(String[] args) {
		List<String> list = List.of("subrat", "sritam", "rahul");
		list.stream().map(str->str.substring(0,1).toUpperCase()+str.substring(1)).forEach(IO::println);
	}
}
