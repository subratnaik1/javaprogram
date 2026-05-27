package com.subrat.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CfDeleteDublicateFromList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("subrat");
		list.add("sritam");
		list.add("rahul");
		list.add("rahul");
		
		System.out.println("before = "+list);
		Set<String>set=new LinkedHashSet<>(list);
		List<String>list1=new ArrayList<>(set);
		System.out.println("after = "+list1);
		
		list1.forEach(l->System.out.println(l));
	}
}
