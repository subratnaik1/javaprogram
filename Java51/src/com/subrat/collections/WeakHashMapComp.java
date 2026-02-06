package com.subrat.collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapComp {
	record Employee(String id, String name) {
		public void finalize() {

		}
	}

	void main()throws InterruptedException  {
		Employee e1 = new Employee("111", "subrat");
		Employee e2 = new Employee("111", "subrat");
		HashMap<Object, String> hashMap = new HashMap<>();
		hashMap.put(e2, "hydrabad");
		WeakHashMap<Employee, String> weakHashmap = new WeakHashMap();
		weakHashmap.put(e1, "samina");
//        e1=null;
        e2=null;
        System.gc();
        Thread.sleep(2000);
        IO.println("weak hashmap:"+weakHashmap+"\n\n WeakHashMap, once the key has no strong reference"
        		+ "Garbage Collector removes the entry automatically");
        IO.println("\nhashmap:"+hashMap+"\n\nIn HashMap, even after key = null,"
        		+ "the entry still exists because HashMap keeps a strong reference.");
	}
}

//Assignment 01 :
//--------------
//Write a program to show that WeakHashMap keys are weak in comparison to HashMap,
//if key is a reference key and it's value is set to be null.