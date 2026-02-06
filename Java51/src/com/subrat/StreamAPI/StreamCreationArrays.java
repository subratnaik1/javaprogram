package com.subrat.StreamAPI;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

record Product(Integer id, String name) {

}

public class StreamCreationArrays {
	void main() {
		String fruits[] = { "apple", "orange", "mango", "banana", "pomangranate" };
		Stream<String> stream = Arrays.stream(fruits);
		stream.forEach(IO::println);
		IO.println("-----------------------------------------------");
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		IntStream s = Arrays.stream(arr);
		s.forEach(IO::println);
		IO.println("-----------------------------------------------");
		long arr2[] = { 7L, 6L, 5L, 4L, 3L, 2L, 1L };
		LongStream ls = Arrays.stream(arr2);
		ls.forEach(IO::println);
		IO.println("-----------------------------------------------");
		double arr3[] = { 1.1, 1.2, 1.3, 1.4 };
		DoubleStream ds = Arrays.stream(arr3);
		ds.forEach(IO::println);
		IO.println("-----------------------------------------------");
		Integer arr4[] = { 1, 2, 3, 4 };
		Stream<Integer> si = Arrays.stream(arr4);
		si.forEach(IO::println);
		IO.println("--------------------Stream.of()---------------------------");
		Product p1 = new Product(4, "laptop");
		Product p2 = new Product(3, "tablet");
		Product p3 = new Product(6, "mobile");
		Product p4 = new Product(1, "camera");
		Product p5 = new Product(2, "tv");
		Stream.of(p1,p2,p3,p4,p5)
		          .sorted((a,b)->a.id().compareTo(b.id()))
		                                      .forEach(IO::println);
		Stream.of(p1,p2,p3,p4,p5)
		.sorted((c,d)->c.name().compareTo(d.name()))
		.forEach(IO::println);
		IO.println("--------------generating infinite Stream-------------------");
        Stream<Double>sd=Stream.generate(()->Math.random());
        sd.limit(10).forEach(IO::println);
		IO.println("-----------------------------------------------");
        Stream<Integer>iterate=Stream.iterate(1, n->n+2);
        iterate.limit(10).forEach(IO::println);

	}
}
