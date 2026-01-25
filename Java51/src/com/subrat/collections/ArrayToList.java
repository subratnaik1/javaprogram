package com.subrat.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Conversion{
	public static void convertToList(String[] inputArray) {
		List<String>list = new ArrayList<>();
		for(int i=0;i<inputArray.length;i++) {
			list.add(inputArray[i]);
		}
		IO.println(list.toString());
		IO.println(list.size());
	}
}

public class ArrayToList {
  void main() {
	  int size = Integer.parseInt(IO.readln("enter size"));
	  String arr[] = new String[size];
	  for(int i=0;i<size;i++) {
		  String value = IO.readln("enter value for "+i+" index");
		  arr[i]=value;
	  }
	  Conversion.convertToList(arr);
  }
}
//Program: 2
//----------------
//Write a Java program to convert Array to List.
//A BLC class called ArrayToList is given to you.
//Add a static method: convertToList(String[] inputArray) : This method 
//takes an array of strings as an argument. It should convert the given 
//array to a list of Strings and return this list. 
//Note that the length of the list must be the same as that of the array. 
//Return null for errors a null array or an empty list for an empty 
//array.
//An ELC Class called Tester with the main method is given to you. Use 
//this class to test your solution
//
