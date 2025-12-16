package com.subrat.predicate;
import java.util.function.*;
public class PredicateDemo2 {

	public static void main(String[] args) {
    Predicate<String>s1=name->name.startsWith("S");
    System.out.println(s1.test("subrat"));

	}

}
