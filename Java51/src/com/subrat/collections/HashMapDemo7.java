package com.subrat.collections;
import java.util.*;
public class HashMapDemo7 {
void main() {
	Map<String ,Integer>h1=new HashMap<>();
	h1.computeIfAbsent("a",k->12 );
	h1.computeIfAbsent("a", k->14);
	h1.computeIfAbsent("c", k->k.length());
	h1.computeIfAbsent(null, k->500);
	h1.computeIfAbsent(null, k->400);
	h1.computeIfAbsent("d", k->null);
		
	IO.println(h1);
	
	Map<String ,Integer>h2=new HashMap<>();
    h2.merge("apple", 10,(v1,v2)->v1+v2);
    h2.merge("apple", 15,(v1,v2)->v1*v2);
    IO.println(h2);
}
}
