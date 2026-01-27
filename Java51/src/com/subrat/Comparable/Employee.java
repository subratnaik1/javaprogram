package com.subrat.Comparable;

public record Employee(Integer id,String name) implements Comparable<Employee>{
public int compareTo(Employee e2) {
	return this.id.compareTo(e2.id);
	
}
}
