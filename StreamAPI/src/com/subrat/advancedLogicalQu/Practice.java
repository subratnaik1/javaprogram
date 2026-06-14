package com.subrat.advancedLogicalQu;

public class Practice {
	private static Practice obj;
	
	private Practice() {};
	
	public static Practice getInstance() {
		if(obj==null) {
			obj=new Practice();		
		}
		return obj;
	}
	
	public static void main(String[] args) {
		Practice p=Practice.getInstance();
		Practice p2=Practice.getInstance();
		System.out.println(p==p2);
		
	}
}