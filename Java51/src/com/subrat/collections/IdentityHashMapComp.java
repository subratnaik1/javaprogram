package com.subrat.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

record Product1(String id) {
};

public class IdentityHashMapComp {
	void main() {
		HashMap<Product1, String> hashMap = new HashMap<>();
		Product1 p1 = new Product1("sn");
		Product1 p2 = new Product1("sn");
		hashMap.put(p1, "first");
		hashMap.put(p2, "second");
		
		  IdentityHashMap<Product1, String> identityMap = new IdentityHashMap<>();
		  Product1 p3 = new Product1("sn");
		  Product1 p4 = new Product1("sn");
		  identityMap.put(p3, "First");
	      identityMap.put(p4, "Second");

	        System.out.println("HashMap contents        : " + hashMap);
	        System.out.println("IdentityHashMap contents: " + identityMap);
	        IO.println("\n\nHashMap uses equals() method to compare keys, whereas IdentityHashMap uses == operator for reference comparison.");
	}
}
//Assignment 02 :
//--------------
//Write a program to show the internal working of IdentityHashMap in comparison to HashMap.
