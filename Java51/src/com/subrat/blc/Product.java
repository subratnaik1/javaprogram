package com.subrat.blc;

public class Product {
	
private int id;
private String name;
private double price;

public Product(int id,String name,double price) {
	this.id=id;
	this.name=name;
	this.price=price;
}

public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}
}
