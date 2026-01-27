package com.subrat.TrielAndError;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice7 {
	void main() {
		Map<String, Integer> map = new HashMap<>();
		map.put("subrat123@gmail.com", 2123);
		map.put("subrat123@gmail.com", 123);
		map.put("subrat123@gmail.com", 23789);
		map.put("sn", 1);
	
		map.putIfAbsent("subrat123@gmail.com", 2);
		Set<Map.Entry<String,Integer>>entries=map.entrySet();
		
		}  
}
