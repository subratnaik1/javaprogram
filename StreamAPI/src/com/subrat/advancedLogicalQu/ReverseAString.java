package com.subrat.advancedLogicalQu;

import java.util.Arrays;

public class ReverseAString {
public static void main(String[] args) {
	String str="hello my name is subrat";
String string = Arrays.stream(str.split(" ")).reduce((a,b)->b+" "+a).toString();
System.out.println(string);
}
}
