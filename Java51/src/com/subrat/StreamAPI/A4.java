package com.subrat.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class A4 {
void main() {
	List <String>l1=new ArrayList<>();
	l1.add("A");
	l1.add("B");
	l1.add("C");
	l1.add("D");
	l1.stream().map(num->num.toLowerCase()).forEach(IO::println);
}
}
