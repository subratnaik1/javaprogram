package com.subrat.collect;

import java.util.List;
import java.util.stream.Collectors;

public class CollectAllevenNo {
public static void main(String[] args) {
	List<Integer>list=List.of(1,2,3,4,5,6,7,8);
	list.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(IO::println);
}
}
