package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAccuranceOfEachWord {
public static void main(String[] args) {
	String str="I am learning streams API in Java Java";
	Map<String, Long> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	System.out.println(collect);
}
}
