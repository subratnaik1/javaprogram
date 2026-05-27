package com.subrat.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CfMaxAndMin {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(1);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		List<String> list1 = new ArrayList<>();
		list1.add("subrat");
		list1.add("sritam");
		list1.add("rahul");
		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));
	}
}
