package com.string.functions;

public class PalindromeString {

	public static void main(String[] args) {
    String str="abcba";
    boolean isPalendrome=true;
   for(int i=0;i<str.length()/2;i++) {
	  if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
		  System.out.println("not palendrome");
		  isPalendrome=false;
		  return;
	  }
	  }
   if(isPalendrome==true) {
	   System.out.println("palendrome");  
     }
	}

}
