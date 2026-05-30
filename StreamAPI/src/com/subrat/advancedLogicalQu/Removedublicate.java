package com.subrat.advancedLogicalQu;

import java.util.Arrays;

public class Removedublicate {
public static void main(String[] args) {
	String str="dadcadefg";
	Arrays.stream(str.split("")).distinct().forEach(IO::println);;
}
}
