package com.subrat.blc;

import java.util.Scanner;

public class Doll {
	
private String name;
private double height;

public Doll(String name,double height) {
	this.name=name;
	this.height=height;	
}
public Doll(Doll doll) {
	this.name=doll.name;
	this.height=doll.height;
}
@Override
public String toString() {
	return "Doll [name=" + name + ", height=" + height + "]";
}

}
class Demo2{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter height");
		double height=Double.parseDouble(sc.nextLine());
		
		Doll d1=new Doll(name,height);
		Doll d2=new Doll(d1);
	}
}