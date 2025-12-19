package com.subrat.predicate;

import java.util.function.Predicate;

record Candidate(String name,Integer age,Integer exp) {		
}
class Eligiblity{	
	void main() {
	String name=IO.readln("enter name");
	Integer age=Integer.parseInt(IO.readln("enter candidates age"));
	Integer exp=Integer.parseInt(IO.readln("enter exp"));
		Candidate c=new Candidate(name,age,exp);
		
		Predicate<Candidate>ageCheck=a->a.age()>=21;
		Predicate<Candidate>expCheck=a->a.exp()>=2;
		
		Predicate<Candidate>check=ageCheck.and(expCheck);
		if(check.test(c)) {
			IO.println("Candidate is eligible for the job");
		}
		else {
			IO.println("Candidate is not eligible for the job");
		}
	}
}

