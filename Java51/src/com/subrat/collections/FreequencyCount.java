package com.subrat.collections;

import java.util.HashMap;

public class FreequencyCount {
void main() {
	String text="java is fun java is powerful java is great";
	String words[]=text.split(" ");
	HashMap<String,Integer>h1=new HashMap<>();
	for(String word:words) {
		
		h1.put(word, h1.getOrDefault(word, 0)+1);
		
	}
	
}
}
