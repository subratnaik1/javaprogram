package com.subrat.predicate;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ogiginal value");
	int ov=Integer.parseInt(sc.nextLine());
	System.out.println("increment by");
	int inc=Integer.parseInt(sc.nextLine());
	
	
    Consumer<Integer>doubleValue= d->System.out.println(d*2);
    Consumer<Integer>incrementBy= i->System.out.println(i+inc);
    Consumer<Integer>squareValue= sq->System.out.println(sq*sq);
    System.out.println(modifyValue(ov,doubleValue);
    modifyValue(ov,incrementBy);
    modifyValue(ov,squareValue);
    
	}
	public static void modifyValue (int value,Consumer<Integer>v1) {
	v1.accept(value);
	}

}
