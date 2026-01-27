package com.subrat.Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

record Costomer(Integer id, String name, double bill) {

};

public class CustomerComparator {
	void main() {
		int size = Integer.parseInt(IO.readln("enter size of array"));
		Costomer[] costomer = new Costomer[size];
		Vector<Costomer> v1 = new Vector<>();
		for (int i = 0; i < size; i++) {
			int id = Integer.parseInt(IO.readln("enter costomer id"));
			String name = IO.readln("enter costomer name");
			double bill = Double.parseDouble(IO.readln("enter bill"));
			v1.add(new Costomer(id,name,bill));
		}
     Collections.sort(v1,(c1,c2)->c1.id().compareTo(c2.id()));
    
    	 IO.println(v1);
     
     IO.println("based on names");
     Collections.sort(v1,(c1,c2)->c1.name().compareTo(c2.name()));
     
    	 IO.println(v1);
    IO.println("based on bill");	 
    Collections.sort(v1,(c1,c2)->Double.compare(c1.bill(), c2.bill()));
    
	 IO.println(v1);
}
	}
// Create a record called Customer, which accepts id, name and bill as a component.
//
//Create an ELC class CustomerComparator with main method.
//
//Create a Customer array with dynamic size and dynamic array initialization using Scanner class. 
//
//Sort the Customer object based on following criteria :
//
//  a) By using Customer id
//  b) By using Customer name
//  c) By using Customer bill
//
