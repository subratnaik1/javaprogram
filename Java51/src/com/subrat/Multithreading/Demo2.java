package com.subrat.Multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {
	void main() {
    List<String> l1=Arrays.asList("apple","banana","orange", "grepe","perr");
    Map<Integer, Long> result= l1.stream().collect(Collectors.groupingBy(k->k.length(),Collectors.counting()));
    result.forEach((length, count) ->
    System.out.println(length + " -> " + count));
	}
}
//Ques - 2
//-----------------------
//Grouping and Counting:
//Given a list of strings, group them by their lengths and count the number of strings in each group. Print out the length and count for each group.
//Input:
//List<String> strings = ["apple", "banana", "orange", "grape", "pear"];
//Expected Output:
//Length -> Count:
//5 -> 2
//6 -> 2
//4 -> 1