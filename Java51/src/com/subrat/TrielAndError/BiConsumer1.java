package com.subrat.TrielAndError;

import java.util.function.BiConsumer;
//it returns nothing
//it void accept(T a,U b) two input;
public class BiConsumer1 {
	void main() {
	BiConsumer<Integer,String>bc=(a,b)->IO.println(a+" "+b);
		bc.accept(1, "subrat");
	}
  
}
