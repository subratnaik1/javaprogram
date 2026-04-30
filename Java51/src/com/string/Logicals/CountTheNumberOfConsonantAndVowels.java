package com.string.Logicals;

public class CountTheNumberOfConsonantAndVowels {

	public static void main(String[] args) {

		String str="hello my name is subrat";
		int consonant=0;
		int vowel=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				continue;
			}
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("consonant="+consonant+" vowels="+vowel);
	}

}
