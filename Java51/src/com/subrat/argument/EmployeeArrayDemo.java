package com.subrat.argument;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class EmployeeArrayDemo {
	void main() {
		int size = Integer.parseInt(IO.readln("enter number of employees"));
		Employee emp[] = new Employee[size];

		int count=1;
		for(int i=0;i<size;i++) {
			IO.println("enter details for Employee :" + count);
			int id = Integer.parseInt(IO.readln("enter ID:"));
			String name = IO.readln("enter name:");
			double salary = Double.parseDouble(IO.readln("Enter Salary"));	
			emp[i]=new Employee(id,name,salary);
			count++;
		}
		for (Employee e : emp) {
			IO.println(e);
		} 
	}
}
