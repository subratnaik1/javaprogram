package com.subrat.collections;

import java.util.Iterator;
import java.util.Vector;

record E(String name, int roll) {};

public class Cf2 {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(new E("subrat",1));
		v.add(new E("rahul",2));
		v.add(new E("raj",3));
		v.add(new E("sritam",4));
    Iterator<E> i=v.iterator();
    while(i.hasNext()) {
    	E e=i.next();
    	if(e.roll()<3) {
    		i.remove();
    	}
    }
    Iterator<E> i2=v.iterator();

    while(i2.hasNext()) {
		System.out.println(i2.next());
	}
	}	
}
