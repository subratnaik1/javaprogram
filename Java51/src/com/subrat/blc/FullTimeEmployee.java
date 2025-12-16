package com.subrat.blc;

public class FullTimeEmployee extends Employee {
	protected double salary;

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		if(salary>0) {
		this.salary=salary;
		}
		else{
			System.out.println("salary cant be negetive");
			System.exit(0);
		}
	}

	public double claculateSalary() {
	
		return salary;
	}
}