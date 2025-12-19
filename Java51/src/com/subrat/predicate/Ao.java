package com.subrat.predicate;

public class Ao {
void main() {

	interface Calculator{
	void calculate(Integer a, Integer b);
	}
	Calculator multiplication=(a,b)->IO.println(a*b);
	Calculator addition=(a,b)->IO.println(a+b);
	Calculator Subtraction=(a,b)->IO.println(a-b);
	
	multiplication.calculate(5, 5);
	addition.calculate(5, 5);
	Subtraction.calculate(5, 5);
}}
