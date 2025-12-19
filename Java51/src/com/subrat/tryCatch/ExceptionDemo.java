package com.subrat.tryCatch;
class Foo extends Exception{//foo must extend from Exception class 
	
}  
   public class ExceptionDemo {

	public static void main(String[] args) {
   try {
	throw new Foo();//only object of throw class or subclasses of throw class 
   }
   catch(Exception e){
	   System.err.println(e); //it will show FQN(fully qualified name)
   }
	}                                                                                                                                                                                           
}
