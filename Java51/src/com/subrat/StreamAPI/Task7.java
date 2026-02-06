package com.subrat.StreamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task7 {
	public static boolean prime(int number) {
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}
void main() {
    Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	Object[]arr=Arrays.stream(numbers).filter(n->prime(n)).toArray();
	IO.println(Arrays.toString(arr));
}
}
