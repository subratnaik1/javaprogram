package com.string.Logicals;

public class NoOfWordsInString {
	public static void main(String[] args) {
		String str = " hello my name is subrat";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i==0 && ch!=' '||(ch!=' ' && str.charAt( i-1 )==' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
