package com.subrat.TrielAndError;

interface MyInterface<T,U,V,X,R>{
	R myApply(T a,U b,V c,X j);
}

public class CostomFunctionalInterface {
	void main() {
      MyInterface<Integer,Integer,Integer,Integer,String> c=(a,b,d,e)->a+b+d+e+"";
      IO.println(c.myApply(1, 2, 3,4));
	}
}
