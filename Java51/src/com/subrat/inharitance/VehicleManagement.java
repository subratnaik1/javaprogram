package com.subrat.inharitance;

import java.util.*;

class Vehicle {
	protected String customerName;

	Vehicle(String customerName) {
		if (customerName.isBlank() || customerName == null) {
			System.err.println("name null errrrorrrrrrrrrrr");
			System.exit(0);
		} else {
			this.customerName = customerName;
		}
	}

	public void calculateRent(double... km) {
		double sum = 0;
		for (double k : km) {
			if (k < 0) {
				System.out.println("km cant be negetive");
				System.exit(0);
			} else {
				sum = sum + k;
			}
		}
		System.out.println("Customer:" + customerName);
		System.out.println("Total km" + sum);

	}
}

class Bike extends Vehicle {
	double cost = 5;

	Bike(String customerName) {
		super(customerName);
	}

	public void calculateRent(double... km) {
		double sum = 0;
		for (double k : km) {
			if (k < 0) {
				System.out.println("km cant be negetive");
				System.exit(0);
			} else {
				sum = sum + k;
			}
		}
		System.out.println("Customer:" + customerName);
		System.out.println("Total km" + sum);
		System.out.println("total rent:" + sum * cost);
	}
}

class Car extends Vehicle {
	double cost = 12;

	Car(String customerName) {
		super(customerName);
	}

	public void calculateRent(double... km) {
		double sum = 0;
		for (double k : km) {
			if (k < 0) {
				System.out.println("km cant be negetive");
				System.exit(0);
			} else {
				sum = sum + k;
			}
		}
		System.out.println("Customer:" + customerName);
		System.out.println("Total km" + sum);
		System.out.println("total rent:" + sum * cost);
	}
}

class Bus extends Vehicle {
	double cost = 20;

	Bus(String customerName) {
		super(customerName);
	}

	public void calculateRent(double... km) {
		double sum = 0;
		for (double k : km) {
			if (k < 0) {
				System.out.println("km cant be negetive");
				System.exit(0);
			} else {
				sum = sum + k;
			}
		}
		System.out.println("Customer:" + customerName);
		System.out.println("Total km" + sum);
		System.out.println("total rent:" + sum * cost);
	}
}

public class VehicleManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vehicle type");
		int choice=Integer.parseInt(sc.nextLine());
		System.out.println("enter customer name");
		String customerName=sc.nextLine();
		System.out.println("Enter number of trips");
		double km=Double.parseDouble(sc.nextLine());
		int trip=Integer.parseInt(sc.nextLine());
	    double arr[]=new double[trip];
		for(int i=0;i<trip;i++) {
			arr[i]=sc.nextDouble();
		}
		Vehicle v;
		switch (choice) {
		case 1 ->{
		v=new Bike(customerName);
		v.calculateRent(km);
		}
		case 2 ->{
		v=new Car(customerName);
		v.calculateRent(km);		
		}
		case 3 ->{
			v=new Bus(customerName);
			v.calculateRent(km);		
			}
		}
	}

}
