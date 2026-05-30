package com.subrat.filter;

import java.util.List;

public class PrintPrime {
	public static boolean isprime(int num) {
    int count=0;
   for(int i=1;i<=num;i++) {
	   if(num%i==0) {
		   count++;
	   }
   }
   if(count==2){
	 return true;  
   }
   else return false;
	}
public static void main(String[] args) {
	List<Integer>list=List.of(1,2,3,5,6,7);
	
	list.stream().filter(num->isprime(num)).forEach(IO::println);
}
}
