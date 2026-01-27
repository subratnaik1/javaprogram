package com.subrat.TrielAndError;

import java.util.Arrays;

public class Practice6{
  void main() {
	  int[] arr = {1, 2, 3, 5, 6};
	  int insert=Integer.parseInt(IO.readln("enter element to insert"));
	  int newArr[]=new int[arr.length+1];
	  for(int i=0;i<arr.length/2+1;i++) {
	  newArr[i]=arr[i];  
	  }
	  newArr[arr.length/2+1]=insert;
	  for(int i=arr.length/2+1;i<arr.length;i++) {
		  newArr[i+1]=arr[i];
	  }	  
	  IO.println(Arrays.toString(newArr));
  }
}