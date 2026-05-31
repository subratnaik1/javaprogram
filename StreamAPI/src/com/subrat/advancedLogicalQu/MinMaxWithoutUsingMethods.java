package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinMaxWithoutUsingMethods {
public static void main(String[] args) {
	int []arr= {3,5,2,6};
	OptionalInt reduce = Arrays.stream(arr)
	.reduce((i1,i2)->i2>i1?i2:i1);
	System.out.println(reduce.getAsInt());
}
}
