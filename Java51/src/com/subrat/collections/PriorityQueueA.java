package com.subrat.collections;

import java.util.PriorityQueue;

public class PriorityQueueA {
void main() {
	PriorityQueue<String> pq=new PriorityQueue<>();
	pq.add("red");
	pq.add("green");
	pq.add("orange");
	pq.add("white");
	pq.add("black");
	IO.println(pq);
}
}
//Assignment 03:
//--------------
//Create a Java program that uses a PriorityQueue to manage a collection of strings. 
//You need to implement the following functionality:
//
//Initialize a PriorityQueue that stores strings.
//Add five different colors ("Red", "Green", "Orange", "White", "Black") to the queue.
//Print all elements of the priority queue.