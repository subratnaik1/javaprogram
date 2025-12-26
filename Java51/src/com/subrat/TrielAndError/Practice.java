package com.subrat.TrielAndError;


public class Practice{
	   public static void main(String[] args) throws Exception
		{
	      System.out.println("Enter main()");
	      try
	      {
			methodA();
	      }
	      catch (Exception e)
	      {
			  System.out.println(e);
	      }
	      System.out.println("Exit main()");
	   }
	 
	   public static void methodA() throws Exception
		   {
	      System.out.println("Enter methodA()");
	      methodB();
	      System.out.println("Exit methodA()");
	   }
	 
	   public static void methodB() throws Exception
		   {
	      System.out.println("Enter methodB()");
	      	methodC();
	      System.out.println("Exit methodB()");
	   }
	 
	   public static void methodC() throws Exception
		   {
	      System.out.println("Enter methodC()");
	       System.out.println(1/0);
	      System.out.println("Exit methodC()");
	   }
	}