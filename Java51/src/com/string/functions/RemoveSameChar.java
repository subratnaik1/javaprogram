package com.string.functions;

public class RemoveSameChar {

	public static void main(String[] args) {
    String str="abrakadabra";
    char ch="a".charAt(0);
    for(int i=0;i<str.length();i++){
    if(str.charAt(i)!=ch) {
    	System.out.println(str.charAt(i));
    }
    }
	}

}
