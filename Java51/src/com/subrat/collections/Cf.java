package com.subrat.collections;

import java.util.Collection;
import java.util.Vector;

public class Cf {
public static void main(String[] args) {
	Collection c=new Vector();
	c.add("java");
	c.add("sql");
	c.add("python");
	c.add("html");
	Collection c1=new Vector();
	c1.add("html");
	c1.add("css");
	c1.add("javascript");
	
	c1.removeAll(c);
	System.out.println(c1);
}
}
