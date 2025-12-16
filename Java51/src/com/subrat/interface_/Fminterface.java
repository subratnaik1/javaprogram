package com.subrat.interface_;

interface Printer{
	abstract public void print();
}
class PrintDemo{
	public Printer getPrinter() {
		return new Printer(){
			public void print() {
				System.out.println("overridden print method");
			}
		};			
	}	
}
public class Fminterface {

	public static void main(String[] args) {
    PrintDemo pd=new PrintDemo();
    pd.getPrinter().print();
    
	}

}
