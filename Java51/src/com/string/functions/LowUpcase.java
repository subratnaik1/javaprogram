package com.string.functions;

public class LowUpcase {

	public static void main(String[] args) {

String str ="jbHJBJHhjhjb12";
int lc=0;
int uc=0;
int sc=0;
for(int i=0;i<str.length();i++) {
	if(Character.isLowerCase(str.charAt(i))) {
		lc++;
		
	}
	else if(Character.isUpperCase(str.charAt(i))) {
		uc++;
		
	}
	else {
		sc++;
		
	}
}
System.out.println("lowercase"+lc+" uppercase"+uc+" special char"+sc);
	}

}
