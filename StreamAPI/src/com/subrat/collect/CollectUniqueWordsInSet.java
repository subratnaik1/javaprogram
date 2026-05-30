package com.subrat.collect;

import java.util.List;
import java.util.stream.Collectors;

public class CollectUniqueWordsInSet {
public static void main(String[] args) {
	List<String>list=List.of("java","java","is","awsome");
	list.stream().distinct().collect(Collectors.toSet()).forEach(IO::println);
}
}
