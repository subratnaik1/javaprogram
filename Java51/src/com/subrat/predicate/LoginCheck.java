package com.subrat.predicate;

import java.util.function.BiPredicate;

public class LoginCheck {
void main() {
	String a=IO.readln("enter str1");
	String b=IO.readln("enter str2");
	BiPredicate<String,String> check=(str1,str2)->str1.equals("admin")&& str2.equals("admin123");
    if(check.test(a,b)) {
    	IO.println("login success");
    }
    else {
    	IO.println("login failed");
    }
}
}
