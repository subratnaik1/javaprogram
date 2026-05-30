package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class WordHavingHighestLength {
public static void main(String[] args) {
	String str="i am learning streams Api in java";
    Optional<String> reduce = Arrays.stream(str.split(" ")).reduce((s1,s2)->s1.length()>s2.length()?s1:s2);
    System.out.println(reduce.get());   
}
}
