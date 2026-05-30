package com.subrat.peek;

import java.util.List;

public class LogImmadiateResWhileMaping {
public static void main(String[] args) {
	List<String>list=List.of("subrat","sritam","rahul");
	list.stream().peek(i->System.out.println("before mapping "+i)).map(name->name.toUpperCase()).peek(i->System.out.println("after mapping")).forEach(IO::println);
}
}
