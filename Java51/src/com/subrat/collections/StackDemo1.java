package com.subrat.collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo1 {
	void main() {
		try {
			Stack<Integer> s = new Stack<>();
			s.push(11);
			s.push(33);
			s.push(44);
			IO.println("after inserting elements are:" + s.toString());
			IO.println("fetching the elements using pop method");
			IO.println(s.pop());
			IO.println(s.pop());
			IO.println(s.pop());
			IO.println(s.pop());
		} catch (EmptyStackException e) {

			e.printStackTrace();
		}
	}
}
