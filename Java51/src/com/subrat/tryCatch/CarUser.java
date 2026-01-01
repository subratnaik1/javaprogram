package com.subrat.tryCatch;

class CarStoppedException extends Exception {
	CarStoppedException(String s) {
		super(s);
	}
}

class CarPunctureException extends Exception {
	CarPunctureException(String p) {
		super(p);
	}
}

class CarHeatException extends Exception {
	CarHeatException(String h) {
		super(h);
	}
}
class CarTest {
	public static void Stop(String s) throws CarStoppedException {
		if (s.equals("stop")) {
			throw new CarStoppedException("Car stopped for some reason.");
		} else if (s.equals("go")) {
			IO.println("Car not stalled.");
		}
	}

	public static void puncture(String p) throws CarPunctureException {
		if (p.equals("puncture")) {
			throw new CarPunctureException("Car is punctured.");
		} else if (p.equals("move")) {
			IO.println("Car not punctured.");
		}
	}

	public static void carHeat(int h) throws CarHeatException {
		if (h > 50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		} else {
			IO.println("Car not stall.");
		}
	}
}

public class CarUser {
	void main(){
		try {
			String s=IO.readln("enter car stopped exception");
			CarTest.Stop(s);
			String p=IO.readln("enter Puncture Exception");
			CarTest.puncture(p);
			int h=Integer.parseInt(IO.readln("enter overheating exception"));
			CarTest.carHeat(h);
	}
		
		catch(Exception e) {
			IO.println(e.getMessage());
		}
}
	
}
