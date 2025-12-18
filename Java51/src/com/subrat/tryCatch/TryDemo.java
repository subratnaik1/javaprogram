package com.subrat.tryCatch;

public class TryDemo {
void main() {
	try {		
		int x=Integer.parseInt(IO.readln("enter value of x"));
		int y=Integer.parseInt(IO.readln("enter value of y"));
		int result=x/y;
		IO.println(result);
	}
	catch(Exception e) {
		IO.println("Inside catch block");		
	}
}
}
