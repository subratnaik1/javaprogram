package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideEvenNoAndOddNo {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8};
	
	 Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(num->num%2==0));
	 System.out.println(collect);
}
}
