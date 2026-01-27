package com.subrat.Comparable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
public class EmployeeComparable {
void main() {
	Vector<Employee> employee=new Vector();
	employee.add(new Employee(1,"d"));
	employee.add(new Employee(3,"a"));
	employee.add(new Employee(2,"z"));
	
	Collections.sort(employee);
	for(Employee emp:employee) {
		IO.println(emp);
	}
}
}
