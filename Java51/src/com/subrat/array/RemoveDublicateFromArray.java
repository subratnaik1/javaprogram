package com.subrat.array;


public class RemoveDublicateFromArray {

	public static void main(String[]args) {
	String str="aBcd";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>'A'&& str.charAt(i)<'Z') {
			char ch=str.charAt(i);
			ch=(char)(ch-32);
			System.out.println(ch);
		}
		
	}
	}
}
