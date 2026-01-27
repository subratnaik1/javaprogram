package com.subrat.collections;
import java.util.*;
public class HashMapDemo5 {
void main() {
	HashMap<String,Boolean> library=new HashMap<>();
	library.put("core java", true);
	library.put("Adv java", true);
	library.put("HTML", false);
	library.put("JavaScript", true);
	
	IO.println("initial library Status");
	library.forEach((k,v)->IO.println(k+" :"+v));
	
	String bookToBorrow="Adv java";
	if(library.containsKey(bookToBorrow)&& library.get(bookToBorrow)) {
		library.put(bookToBorrow, false);
		IO.println(bookToBorrow+" book borrowed");
	}
	else {
		IO.println(bookToBorrow+"it is not in library");
	}
	String bookToCheck="JavaStript";
	if(library.containsKey(bookToCheck)) {
		String availablity=library.get(bookToCheck)?"available":"borrowed";
		IO.println(bookToCheck+" book is "+availablity);
	}
	IO.println("final library status:");
	for(HashMap.Entry<String,Boolean>entry:library.entrySet()) {
		String status=entry.getValue()?"available":"Borrowed";
		IO.println("Book: "+entry.getKey()+" ,"+status);
	}
}
}
