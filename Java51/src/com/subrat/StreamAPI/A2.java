package com.subrat.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class A2 {
void main() {
	List <String>l1=new ArrayList<>();
	l1.add("a");
	l1.add("b");
	l1.add("c");
	l1.add("d");
	l1.add("f");
	l1.stream().map(num->num.toUpperCase()).forEach(IO::println);
}
}
