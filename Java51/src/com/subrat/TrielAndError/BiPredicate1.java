package com.subrat.TrielAndError;

import java.util.function.BiPredicate;
//here U,T are input type
//boolean test(U x,T y)
public class BiPredicate1 {
void main() {
	BiPredicate<String,Integer> bp=(a,b)->a.length()==b;
	IO.println(bp.test("10", 2));
}
}
