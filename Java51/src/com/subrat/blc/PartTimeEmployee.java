package com.subrat.blc;

public class PartTimeEmployee extends Employee {
	protected double hourlyrate;
	protected double hoursWorked;

	public PartTimeEmployee(int id, String name, double hourlyrate, double houseWorked) {
		super(id, name);
		if(hourlyrate>0) {
			this.hourlyrate = hourlyrate;			
		}
		else {
			System.out.println("employee Hourly rate cant be 0");
			System.exit(0);
		}
		this.hoursWorked = houseWorked;
	}

	public double calculateSalary() {
		
		return hourlyrate*hoursWorked;
	}
}
