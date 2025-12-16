package com.subrat.predicate;
import java.util.Scanner;
import java.util.function.Predicate;


public class PredicateDemo1 {

	public static void main(String[] args) {
		Predicate<Integer>p1=age-> age>=18;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter my age");
        int Myage=Integer.parseInt(sc.nextLine());
        System.out.println(p1.test(Myage));
	}

}
