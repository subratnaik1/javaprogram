package com.subrat.argument;

import java.util.Scanner;

public class ArrayPrime{

	public static void main(String[] args) {
		long var=2356578;
		long num=var;
		while(num>0) {
			long dig=num%10;
			int count=0;
			for(int i=2;i<=dig/2;i++) {
			if(dig%i==0) {
				count ++;
			}
			}
			if(count ==0){				
				System.out.println(dig);		
			}
			num=num/10;
		}
}}