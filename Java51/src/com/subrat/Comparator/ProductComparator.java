package com.subrat.Comparator;

import java.util.Collections;
import java.util.Vector;

public class ProductComparator {
void main() {
	Vector<Product>listOfProducts=new Vector<>();
	listOfProducts.add(new Product(3,"mobile",3243.0));
	listOfProducts.add(new Product(2,"laptop",4243.0));
	listOfProducts.add(new Product(1,"camera",1243.0));
	IO.println("based om product id");
	Collections.sort(listOfProducts,(p1,p2)->Integer.compare(p1.id(), p2.id()));
	for(Product product:listOfProducts) {
		IO.println(product);		
	}
	IO.println("based om product name");
	Collections.sort(listOfProducts,(p1,p2)->p1.name().compareTo(p2.name())) ;
	for(Product product:listOfProducts) {
		IO.println(product);		
	}
	IO.println("based om product price");
	Collections.sort(listOfProducts,(p1,p2)->Double.compare(p1.price(),p2.price())) ;
	for(Product product:listOfProducts) {
		IO.println(product);		
	}
}
}
