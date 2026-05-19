package com.subrat.collections;

import java.util.Spliterator;
import java.util.Vector;

public class Cf {
public static void main(String[] args) {
	Vector <String>c=new Vector<>();
	c.add("java");
	c.add("sql");
	c.add("python");
	c.add("html");
//	----------------Enumeration--------------
//	Enumeration e=c.elements();
//    while(e.hasMoreElements()) {
//    	System.out.println(e.nextElement());
//    }
//	---------------for Each-----------------
//	for(String s :c) {
//		System.out.println(s);
//	}
//	-----------------Iterator-------------
//	Iterator i=c.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
//	------------------listIterator-----------
//	ListIterator li=c.listIterator();
//	while (li.hasNext()) {
//		li.next();
//	}
//	while(li.hasPrevious()) {
//		System.out.println(li.previous());
//	}
//	------------------------splitIterator--------
//	Spliterator si=c.spliterator();
//	si.forEachRemaining(System.out::println);
//-----------------------------forEach-------------------
//	c.forEach(n->System.out.println(n));
//	----------------------------method reference(::)--------------
//	c.forEach(IO::println);
//----------------------------------stream methd-------------
//	c.stream().forEach(IO::print);
}
}
