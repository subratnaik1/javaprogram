package com.string.functions;

public class FreequencyNo {

	public static void main(String[] args) {
     String str="hello world";
     char ch[]=str.toCharArray();
     for(int i=0;i<str.length();i++)
     {
    	int count=0;
    	if(ch[i]=='*') {
    		continue;
    	}
     for(int j=0;j<str.length();j++) {
    	 if(str.charAt(i)==str.charAt(j)) {
    		count++; 
    		ch[j]='*';
    	 }
     }
     System.out.println(str.charAt(i)+" : "+count);
     }
	}
}
