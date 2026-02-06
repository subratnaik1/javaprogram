package com.subrat.StreamAPI;

import java.util.stream.Stream;

public class Task6 {
void main() {
	 String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
	 Stream.of(names).filter(n->n.contains("a")).forEach(IO::println);
}
}
