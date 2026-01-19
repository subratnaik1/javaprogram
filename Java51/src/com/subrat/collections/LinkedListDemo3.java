package com.subrat.collections;

import java.util.LinkedList;
import java.util.ListIterator;
       
public class LinkedListDemo3 {
	void main() {
		LinkedList<String> city = new LinkedList<>();
		city.add("Kolkata");
		city.add("Banglore");
		city.add("Hydrabad");
		city.add("pune");
		IO.println(city);
		ListIterator<String> it = city.listIterator();
		while (it.hasNext()) {
			String cityName = it.next();
			if (cityName.equals("Kolkata")) {
				it.remove();
			} else if (cityName.equals("Hydrabad")) {
				it.add("ameerpeth");
			} else if (cityName.equals("pune")) {
				it.set("Mumbai");
			}
		}
		city.forEach(System.out::println);
	}
}
