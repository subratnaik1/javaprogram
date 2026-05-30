package com.subrat.forEach;

import java.util.List;

public class printAllOfList {
public static void main(String[] args) {
	List <String>list=List.of("subrat","rahul","Sritam");
	list.stream().forEach(IO::println);
}
}
