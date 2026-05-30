package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.Comparator;
public class NthHighestLength {
	public static void main(String[] args) {
    String str="i am learning streams Api in java";
    Arrays.stream(str.split(" ")).sorted((s1,s2)->s2.length()-s1.length()).skip(1).limit(1).forEach(IO::println);;
	}
}
