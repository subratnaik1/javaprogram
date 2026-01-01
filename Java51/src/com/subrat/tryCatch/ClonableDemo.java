package com.subrat.tryCatch;

class Product1 extends Object implements Cloneable {
int id;
String name;

Product1(int id,String name){
	super();
	this.id=id;
	this.name=name;
}
@Override
public Object clone()throws CloneNotSupportedException {
	return super.clone();
}
@Override
public String toString() {
	return "Product1 [id=" + id + ", name=" + name + "]";
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}

}

public class ClonableDemo {
void main()  {
	try {
	Product1 p1=new Product1(111,"jhbb");
	Product1 p2=(Product1) p1.clone();
	IO.println(p1+": "+p2);
	IO.println("after change");
	p1.setId(222);
	p1.setName("sddds");
	IO.println(p1+": "+p2);
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
}
}
