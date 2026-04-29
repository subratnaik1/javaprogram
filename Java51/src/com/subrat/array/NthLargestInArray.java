package com.subrat.array;

import java.util.Collections;
import java.util.PriorityQueue;

public class NthLargestInArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 4, 2, 7, 5, 1 };
		int n=Integer.parseInt(IO.readln("enter "));
		PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
        for(int a:arr) {
        	pq.add(a);
        }
        for(int i=1;i<n;i++) {
        	pq.poll();
        }
        IO.println(pq.peek());
	}
}
