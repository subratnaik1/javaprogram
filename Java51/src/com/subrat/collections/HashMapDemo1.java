package com.subrat.collections;

import java.util.*;

public class HashMapDemo1 {
	void main() {
    HashMap<Integer,String>m1=new HashMap<>();
    HashMap<Integer,String>m2=new HashMap<>();
    
    m1.put(1," ODBC");
    m1.put(2, "is");
    m1.put(3, "best");
    
    IO.println("values in m1: "+m1);
    m2.put(4,"exam");
    IO.println("values in m2:"+m2);
    IO.println("after putting putall");
    m1.putAll(m2);
    m1.forEach((k,v)->IO.println(k+":"+v));
    
    IO.println("All the keys are:");
    Set<Integer> keyset=m1.keySet();
    IO.println(keyset);
   
    Collection<String> values=m1.values();  
    IO.println(values);
    
    HashMap<String,String>map1=new HashMap<>();
    map1.put("Subrat@123", "12");
    map1.put("jaggu@123", "1234");
    map1.put("raju@123", "123");
    IO.println("from map1 :"+map1);
    
    HashMap<String,String>map2=new HashMap<>(map1);
    IO.println("from map2 :"+map2);

    
	}
}
