package com.subrat.collections;
import java.util.*;
//program where student can select multiple subject according to the choice

public class HashMapDemo8 {
	void main() {
    Map<String,List<String>>subjects=new HashMap<>();
    subjects.computeIfAbsent("subrat", k->new ArrayList<String>()).add("java");
    subjects.computeIfAbsent("subrat", k->new ArrayList<String>()).add("adv java");
    
    IO.println(subjects);
	}
}
