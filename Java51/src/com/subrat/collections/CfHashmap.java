package com.subrat.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CfHashmap {
public static void main(String[] args) {
	Map<String,Integer>map=new HashMap<>();
	map.put("A", 1);
	map.put("A", 2);
	System.out.println("size is :"+map.size());
	System.out.println(map);
	Set<String> keySet = map.keySet();
	System.out.println("------------------------------");
	Map<Integer,Integer>map1=new HashMap<>();
	map1.put(128, 1);
	map1.put(128, 2);
	System.out.println("size is :"+map1.size());
	System.out.println(map1);
	Set<Integer> keySet1 = map1.keySet();
	System.out.println("------------------------------");
	Map<Object,Object>map2=new HashMap<>();
	map2.put("a", 1);
	map2.put("a", 2);
	map2.put(new String("a"), 3);
	map2.put(65,4);
	System.out.println("size is :"+map2.size());
	System.out.println(map2);
}
}
