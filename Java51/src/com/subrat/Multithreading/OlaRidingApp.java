package com.subrat.Multithreading;

class RideRequest extends Thread {
	public void run() {
		IO.println("User requested a ride...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IO.println("Searching for nearby drivers...");
	}
}

class DriverAssignment extends Thread {
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IO.println("Driver found and assigned!");
	}
}

class FareCalculation extends Thread{
	public void run() {
		IO.println("Calculating estimated fare...");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
			IO.println("Estimated fare: 135.75 RS.");
		}
	}
}

class LiveTracking extends Thread{
	public void run() {
		for(int i=20;i<=100;i=i+20) {
			IO.println("Updating ride location... "+i+"% completed");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		IO.println("Ride Completed");
	}
}

class PaymentProcessing extends Thread{
public void run() {
	IO.println("Processing payment...");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	IO.println("Payment successful!");
}
}

class RatingSystem extends Thread{
	public void run() {
		IO.println("Requesting user rating...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IO.println("User rated the ride: 5 star");
	}
}

public class OlaRidingApp {
	void main() {
		RideRequest rr=new RideRequest();
		DriverAssignment da=new DriverAssignment();
		FareCalculation fc=new FareCalculation();
		LiveTracking lt=new LiveTracking();
		PaymentProcessing pp=new PaymentProcessing();
		RatingSystem rs=new RatingSystem();
		rr.start();
		fc.start();
		try {
			rr.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		da.start();
		lt.start();
		try {
			lt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pp.start();
		rs.start();		
	}
}
