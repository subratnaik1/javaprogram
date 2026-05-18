package com.subrat.Multithreading;

public class OddEvenSequentiallyPrint {
	int i=1;
    public synchronized void odd() {
    	try {
    		while(i<10) {
    			if(i%2==0) {
    				wait();
    			}
    			else {
    				System.out.println("odd="+i);
    				i++;
    				notify();
    			}
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    public synchronized void even() {
    	try {
    		while(i<10) {
    			if(i%2!=0) {
    				wait();
    			}
    			else {
    				System.out.println("even="+i);
    				i++;
    				notify();
    			}
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
	public static void main(String[] args) {

		OddEvenSequentiallyPrint t1=new OddEvenSequentiallyPrint();
		
		new Thread(()->t1.odd()).start();
		new Thread(()->t1.even()).start();
	}
}