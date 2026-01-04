package com.subrat.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

record Product(int prpductId,String ProductName) {
	
};
public class vectorDemo9 {

void main() {
	Vector <Product> ListofProducts=new Vector<>();
	ListofProducts.add (new Product(111,"camera"));
	ListofProducts.add (new Product(222,"mobile"));
	ListofProducts.add (new Product(333,"bag"));
	
	IO.println("Element at 0 index"+ListofProducts.elementAt(0));
	Enumeration<Product> element=ListofProducts.elements();
	Iterator<Product>itr=element.asIterator();
	itr.forEachRemaining(System.out::println);

}}
