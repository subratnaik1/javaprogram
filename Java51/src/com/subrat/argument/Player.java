package com.subrat.argument;

import java.util.Scanner;

class Player {
	private int id;
	private String name;
	private int price;
	
	public Player(int id,String name,int price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return "id= "+id+" name "+name+" price "+price+" ";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size ");
		int size=Integer.parseInt(sc.nextLine());
		Player player[]=new Player[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter id");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter price");
			int price=Integer.parseInt(sc.nextLine());
			
			player[i]=new Player(id,name,price);
			
		}
		for(int i=0;i<size;i++) {
			System.out.println(player[i]);
		}
	}

}
