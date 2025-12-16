package com.subrat.instanceofop;
class Alpha{
	
}
class Beta extends Alpha{
	
}
class Gamma extends Beta{
	
}
public class Exp {

	public static void main(String[] args) {
	Alpha a=new Alpha();
    if (a instanceof Object) {
	System.out.println("g is pointing at Gamma object");  
	}
   
}}

