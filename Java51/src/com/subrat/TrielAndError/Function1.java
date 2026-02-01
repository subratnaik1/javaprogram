package com.subrat.TrielAndError;

import java.util.function.Function;

//R apply(T x) abstract method is hidden
//here T -input type and
//R-return type 
//both will be decided by user
public class Function1 {
 void main() {
	 Function<String,Integer> fn1=str->str.length();
	 IO.println(fn1.apply("samina"));
 }
}
