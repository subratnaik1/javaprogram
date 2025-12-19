package com.subrat.TrielAndError;

interface NIT
{
	void myInterface(int a);
}
public class Practice {
	public static void main(String[] args) {
		NIT nit = (int a) -> System.out.println(a+5);
		nit.myInterface(15);
	}
	String si="kjn";
}