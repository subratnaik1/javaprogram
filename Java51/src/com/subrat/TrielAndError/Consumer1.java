package com.subrat.TrielAndError;

import java.util.function.Consumer;

record p(Integer id,String name) {
}
//it is used to accept a value but it doesnt return anything;
//void accepect() abstract method is hidden;
public class Consumer1 
{
	void main() {
    Consumer<Integer> c1=num->IO.println("number "+num);
    c1.accept(12);
	}
}
