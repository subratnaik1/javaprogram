package com.subrat.Multithreading;

public class Deadlock {
	public static void main(String[] args) {
    try {
    	Thread th=Thread.currentThread();   	
    	th.join();
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
	}
}
