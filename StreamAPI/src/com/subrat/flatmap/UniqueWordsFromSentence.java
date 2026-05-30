package com.subrat.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UniqueWordsFromSentence {
public static void main(String[] args) {
	List<String>sentence=List.of("hello java","java is awsome","hello java");
	sentence.stream().flatMap(s->Arrays.stream(s.split(" "))).distinct().forEach(IO::println);
}
}
