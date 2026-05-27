package com.subrat.collections;

import java.util.ArrayList;
import java.util.List;

public class CfAsecendingDescendingSort {
public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	list.add("b");
	list.add("a");
	list.add("d");
	list.add("c");
//	Collections.sort(list);
//	System.out.println(list);
//	Collections.reverse(list);
//	System.out.println(list);
//	-----------------------without using compare.reverse();------------
	list.sort((i,j)->j.compareTo(i));
	System.out.println(list);
}
}
