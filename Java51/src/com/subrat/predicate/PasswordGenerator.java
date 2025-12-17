package com.subrat.predicate;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {
void main() {
	 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String lower = "abcdefghijklmnopqrstuvwxyz";
	 String digits = "0123456789";
	 String special = "@#$%!&*";

	 Supplier<String> sup=()->
	 {
	 String total=upper+lower+digits+special;
	 String str="";
	 Random random=new Random();
	 for(int i=1;i<=8;i++) {
		 str+=total.charAt(random.nextInt(total.length()));
	 }
	 return str;
	 };
	 IO.println(sup.get());
	
}
}
