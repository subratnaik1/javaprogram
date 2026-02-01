package com.subrat.TrielAndError;

import java.util.function.Predicate;

record Student7(int id, String name) {
}
//boolean test() abstract method is hidden which returns boolean value
//Predicate<Integer> p1=num->num>=18; eligible for vote;

public class Predicate1 {
	void main() {

		Student7 s = null;
		Predicate<Student7> p = student -> student.id() > 10;

		Student7 arr[] = new Student7[5];

		arr[0] = new Student7(1, "Subrat");
		arr[1] = new Student7(2, "Amit");
		arr[2] = new Student7(33, "Ravi");
		arr[3] = new Student7(4, "Suman");
		arr[4] = new Student7(53, "Rahul");

		for (Student7 h : arr) {
			if (p.test(h)) {
				IO.println(h + "=>pass");
			} else {
				IO.println(h + "=>fail");
			}
		}

	}
}
