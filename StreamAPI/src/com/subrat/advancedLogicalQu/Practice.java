package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
    Object[] array = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toArray();
	System.out.println(Arrays.toString(array));
}
}
