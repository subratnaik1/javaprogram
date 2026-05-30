package com.subrat.flatmap;

import java.util.List;

public class ListOfListtoSingleList {
	public static void main(String[] args) {

		List<Integer> list1=List.of(1,2,3,4);
		List<Integer> list2=List.of(4,5,6,7);
		List<List<Integer>>list=List.of(list2,list1);
		list.stream().flatMap(l->l.stream()).forEach(IO::println);
		
		
	}
}
