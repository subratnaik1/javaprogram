package com.subrat.StreamAPI;

import java.util.Arrays;

public class Task5 {
void main() {
	  Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
	   Arrays.stream(numbers).filter(n->n>0).forEach(IO::println);
}
}
//WAP to remove Negative Numbers from an Integer Array.
//
//Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
//
//Output : Positive Numbers: [5, 10, 15]