package com.subrat.tryCatch;

public class ArrayIndexExceptionDemo {
void main() {
	try {		
		int a[] = new int[2];
		a[3] = 10;
		a[1] = 20;
	}
	catch(ArrayIndexOutOfBoundsException e){
		//IO.println(e.getMessage());
	      e.printStackTrace();
        //	e.toString();
	}
}
}
