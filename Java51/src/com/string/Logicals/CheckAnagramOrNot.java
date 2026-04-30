package com.string.Logicals;

public class CheckAnagramOrNot {
	public static void main(String[] args) {
    String str1="subrat";
    String str2="tarbsu";
    boolean anagram=true;
    for(int i=0;i<str1.length();i++) {
    	if(str1.length()!=str2.length()) {
    		anagram=false;
    		break;
    	}
    	int count1=0;
    	int count2=0;
    	char ch=str1.charAt(i);
    	for(int j=0;j<str2.length();j++) {
    		if(str1.charAt(j)==ch) {
    			count1++;
    		}
    		if(str2.charAt(j)==ch) {
    			count2++;
    		}
    	}
    	if(count1!=count2) {
    		anagram=false;
    		break;
    	}
    }
    if(!anagram) {
    	System.out.println("not anagram");
    }
    else {
    	System.out.println("anagram");
    }
	}
}
