package com.subrat.reduce;

import java.util.List;
import java.util.Optional;

public class FindMaxINumber {
public static void main(String[] args) {
	List<Integer>list=List.of(1,2,3,4,5);
Optional<Integer> reduce = list.stream().reduce((i1,i2)->i1>i2?i1:i2);
System.out.println(reduce);
}
}
