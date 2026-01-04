package com.subrat.collections;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo1 {
	
void main() {
	Vector<Integer>v1=new Vector(50,10);
	IO.println("capacity= :"+v1.capacity());
	for(int i=0;i<50;i++) {
		v1.add(i);
	}
	v1.add(50);
	IO.println("after adding 50 elements :"+v1.capacity());
	for(int i=0;i<51;i++) {
		IO.println(v1.get(i));
	}
	Collections.reverse(v1);
	for(int i=0;i<51;i++) {
		IO.println(v1.get(i));
	}
     IO.println(Collections.min(v1));
     IO.println(Collections.max(v1)); 
   
}}

