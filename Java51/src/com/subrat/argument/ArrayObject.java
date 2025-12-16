package com.subrat.argument;

import java.util.Scanner;

class ArrayObject {
      private int id;
      private String name;
       
      public ArrayObject(int id,String name) {
    	  this.id=id;
    	  this.name=name;
      }
      public String toString() {
    	  return "my name is "+name+" and id is" +id+ "";
      }
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
			ArrayObject student[]=new ArrayObject[5];
			student[0]=new ArrayObject(11,"subrat");
			student[1]=new ArrayObject(12,"Anjali");
			student[2]=new ArrayObject(13,"shubham");
			student[3]=new ArrayObject(14,"vinit");
			student[4]=new ArrayObject(15,"rahul");
			
			for(int i=0;i<student.length;i++) {
				System.out.println(student[i]);
			}
		}

	}

