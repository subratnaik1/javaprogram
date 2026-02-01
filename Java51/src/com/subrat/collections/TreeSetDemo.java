package com.subrat.collections;

import java.util.TreeSet;

record Produc(int pid, String name) {

	Produc {
		if (pid <= 0) {
			throw new IllegalArgumentException("enter valid data");
		}
	}
}
public class TreeSetDemo {
	void main() {
		TreeSet<Produc> p1 = new TreeSet<>((t1, t2) -> Integer.compare(t1.pid(), t2.pid()));
		p1.add(new Produc(2, "subrat"));
		p1.add(new Produc(1, "shubham"));
		p1.add(new Produc(3, "rajiv"));

		for(Produc p:p1) {
			IO.println(p);
		}
		IO.println("---------------------------------------------------------");
		TreeSet<Produc> p2 = new TreeSet<>((t1, t2) -> Integer.compare(t2.pid(), t1.pid()));
		p1.add(new Produc(2, "subrat"));
		p1.add(new Produc(1, "shubham"));
		p1.add(new Produc(3, "rajiv"));

		for(Produc p:p1) {
			IO.println(p);
		}
		IO.println("---------------------------------------------------------");
//		TreeSet<Produc> p3 = new TreeSet<>((t1, t2) -> t1.name().compareTo(t2.name()));
//		p1.add(new Produc(2, "subrat"));
//		p1.add(new Produc(1, "shubham"));
//		p1.add(new Produc(3, "rajiv"));

//		for(Produc p:p1) {
//			IO.println(p);
//		}

	}
}
