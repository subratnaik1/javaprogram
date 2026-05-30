package com.subrat.sorted;

import java.util.Comparator;
import java.util.List;

public class SortListIntegerToAscDes {
	public static void main(String[] args) {
    List<Integer>list=List.of(5,7,3,1,8);
    list.stream().sorted(Comparator.reverseOrder()).forEach(IO::println);
	}
}
