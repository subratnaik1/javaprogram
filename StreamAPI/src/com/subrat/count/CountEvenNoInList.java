package com.subrat.count;

import java.util.List;

public class CountEvenNoInList {
public static void main(String[] args) {
	List<Integer>list=List.of(1,2,3,4,5,6,7);
	long count = list.stream().filter(i->i%2==0).count();
	System.out.println(count);
}
}
