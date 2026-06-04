package com.subrat.advancedLogicalQu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.stream.events.Characters;

public class Practice {
public static void main(String[] args) {
	String [] s = {"abc", "123", "456", "xyz"};
	List<Integer> list = Arrays.stream(s).filter(c->c.chars().allMatch(ch->Character.isDigit(ch))).map(m->Integer.parseInt(m)).toList();
System.out.println(list);
}
}