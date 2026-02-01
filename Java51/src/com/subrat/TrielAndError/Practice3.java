package com.subrat.TrielAndError;

import java.util.*;

public class Practice3 {

	void main() {
		Map<String, Integer> m = new HashMap<>();
		m.put("jknj", 1);
		m.put("jkn", 4);
		m.put("jkj", 3);
        Set<Map.Entry<String, Integer>>entry=m.entrySet() ;
        	m.forEach((k,v)->IO.println("key "+k+" : "+v));
	   }
}
