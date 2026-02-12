package com.subrat.Multithreading;

class Odd extends Thread {
	public void run() {
		IO.println("odd numbers");
		for(int i=0;i<=100;i++) {
			if(i%2!=0) {
				IO.println(i+" ");
			}
		}
		IO.println();
	}
}
public class Demo4 {
	void main() {
		Odd o=new Odd();
		o.start();
		try {
			o.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IO.println("even numbers");
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				IO.println(i+" ");
			}
		}
		
	}
}
