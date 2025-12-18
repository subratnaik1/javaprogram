package com.subrat.tryCatch;

public class ThrowableMethod {

	public static void main(String[] args) {
		try {
			int arr[] = new int[-10];
		} catch (Exception e) {
         IO.println(e);//tostring FQN: errorMessage
         IO.println(e.getMessage());//errorMessage
         e.printStackTrace();//complete details of error
		}
	}

}
