package com.string.Logicals;

public class NthNonRepetingCharacterInString {
public static void main(String[] args) {
	String str="swijkss";
	int n=3;
	int countRepeat=0;
	for(int i=0;i<str.length();i++) {
		int count=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		if(count==1) {
			countRepeat++;
			if(countRepeat==n) {
				System.out.println(n+"th non repeat character is="+str.charAt(i));
			}
		}
	}
}
}
