package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Practice {
	public static void main(String[] args) {
		String s[]={"subrat","rahul"};
		Object[] a=Arrays.stream(s).map(c->Comparator.reverseOrder()).toArray();
		System.out.println(Arrays.toString(a));
	}
}