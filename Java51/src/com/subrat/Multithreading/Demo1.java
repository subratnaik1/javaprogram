package com.subrat.Multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
	void main() {
     List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     l1.stream().filter(num->num%2!=0).map(num->num*num).forEach(IO::println);
	}
}
