package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.Comparator;

public class RearrangeElementsToHighestAndLowestPossible {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 4 };
		int[] array = Arrays.stream(arr).sorted().toArray();
		System.out.println(Arrays.toString(array));
		
		Object[] array2 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toArray();
		System.out.println(Arrays.toString(array2));
	}
}
