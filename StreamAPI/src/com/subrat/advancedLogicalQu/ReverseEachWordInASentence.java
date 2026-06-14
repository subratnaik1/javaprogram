package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInASentence {
public static void main(String[] args) {
	String str="hello my name is subrat";
	String  result = Arrays.stream(str.split(" ")).map(word->Arrays.stream(word.split("")).reduce((a,b)->b+a).orElse("")).collect(Collectors.joining(" "));
	System.out.println(result);
}
}
