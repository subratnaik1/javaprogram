package com.string.functions;

public class StringContainsDig {

	public static void main(String[] args) {
    String str="subra";
   for(int i=0;i<str.length();i++) {
	if(Character.isDigit(str.charAt(i))) {
		System.out.println("has digit");
		return;
	}
   }
   System.out.println("no digit");
	}

}
