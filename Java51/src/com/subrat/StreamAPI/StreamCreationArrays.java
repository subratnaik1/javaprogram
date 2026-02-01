package com.subrat.StreamAPI;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreationArrays {
void main() {
	String fruits[]= {"apple","orange","mango","banana","pomangranate"};
	Stream<String> stream=Arrays.stream(fruits);
	stream.forEach(IO::println);
	IO.println("-----------------------------------------------");
	int arr[]= {1,2,3,4,5,6,7};
	IntStream s=Arrays.stream(arr);
	s.forEach(IO::println);
	IO.println("-----------------------------------------------");
    long arr2[]= {7L,6L,5L,4L,3L,2L,1L};
    LongStream ls=Arrays.stream(arr2);
    ls.forEach(IO::println);
	IO.println("-----------------------------------------------");
    double arr3[]= {1.1,1.2,1.3,1.4};
    DoubleStream ds=Arrays.stream(arr3);
    ds.forEach(IO::println);
	IO.println("-----------------------------------------------");
    Integer arr4[]= {1,2,3,4};
    Stream<Integer>si=Arrays.stream(arr4);
    si.forEach(IO::println);
}
}
