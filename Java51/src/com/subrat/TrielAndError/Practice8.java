package com.subrat.TrielAndError;
import java.util.*;
import java.util.Map.Entry;

public class Practice8 {
void main() {
	Map<String,Integer>flights=new HashMap<>();
	flights.put("mumbai", 51000);
	flights.put("banglore", 70000);
	flights.put("chennai", 65000);
	flights.put("odisha", 50000);
	
//	Entry<String,Integer>entry=Collections.max(flights.entrySet(),(m1,m2)->m2.getKey().compareTo(m1.getKey()));
//	IO.println(entry.getKey()+" : "+entry.getValue())
int min=Collections.min(flights.values());
for(Map.Entry<String,Integer>f:flights.entrySet()) {
	if(f.getValue()==min) {
		IO.println(min);
	}
}
}
}
