package com.string.Logicals;

public class FirstLetterCapital {
	public static void main(String[] args) {
		String str = "hello subrat";
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			char c = s.charAt(0);
            c=(char)(c-32);
            String result=c+s.substring(1);
            System.out.println(result);
		}
	}
}
