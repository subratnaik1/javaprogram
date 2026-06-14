package com.java.singleton;

public class Singleton {
	
private static Singleton obj;

private Singleton() {}

public static Singleton getInstance() {
	if(obj==null) {
		obj=new Singleton();
	}
	return obj;
}

public static void main(String[] args) {
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1==s2);
}

}
