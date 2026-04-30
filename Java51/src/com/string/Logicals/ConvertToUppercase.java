package com.string.Logicals;

public class ConvertToUppercase {

	public static void main(String[] args) {
		String str="my name is subrat";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			ch=(char)(ch-32);
			System.out.print(ch);
		}
	}
}
