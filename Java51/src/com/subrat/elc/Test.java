package com.subrat.elc;

import java.util.Scanner;

class Animal{
	private String name;
	
	Animal(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void steName(String name) {
		this.name=name;
	}
}
class Mammal extends Animal{
	private boolean hasFur;
   
	Mammal(String name,boolean hasFur){
		super(name);
		this.hasFur=hasFur;
	}
	public boolean getHasFur() {
		return hasFur;
	}
	public void setHasfur(boolean hasFur) {
		this.hasFur=hasFur;
	}
}
class Dog extends Mammal{
	private String breed;
	
	Dog(String name,boolean hasFur,String breed){
		super(name,hasFur);
		this.breed=breed;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}	
}
public class Test{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice-");
		System.out.println("1 Animal");
		System.out.println("2 Mammal");
		System.out.println("3 Dog");
		int choice=sc.nextInt();
		switch(choice){
			case 1->{Animal an=new Animal("lion");
			 System.out.println("Animal [getName()"+an.getName()+"]");
			 }
			case 2->{Mammal mml=new Mammal("gorille",false);
			System.out.println("Mammal[getName()="+mml.getName()+"ishasFur="+mml.getHasFur());
			} 
			case 3->{Dog dg=new Dog("subrat",false,"labrador");
			System.out.println(dg.getName()+dg.getHasFur()+dg.getBreed());
			}
		}
	}
}