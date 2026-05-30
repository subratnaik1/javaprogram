package com.subrat.reduce;

import java.util.List;

public class findSumOfAllIntegerInList {
public static void main(String[] args) {
	List<Integer>list=List.of(1,2,3,4,5);
	Integer reduce = list.stream().reduce(0,(i1,i2)->i1+i2);
	System.out.println(reduce);
}
}
