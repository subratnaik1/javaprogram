package com.subrat.abstract1;
import java.util.*;

abstract class Cake{
	private String Shape;
	private String flavour;
	private int quantity;
	public static double price=400;
	
	Cake(String shape,String flavour,int quantity){
		this.Shape=shape;
		this.flavour=flavour;
		this.quantity=quantity;
	}

	public String getShape() {
		return Shape;
	}

	public void setShape(String shape) {
		Shape = shape;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
public String toString() {
	return "A round chocolate cake of "+quantity+" is ready at rs"+price*quantity+"";
}
}
class OrderedCake extends Cake {
	private String message;
	
	OrderedCake(){
   super("round","vanilla",1);
	}
	public OrderedCake(String shape,String flavour,int quantity) {
		super(shape,flavour,quantity);		
	}
	public OrderedCake(String shape,String flavour,int quantity,String message) {
		super(shape,flavour,quantity);
		this.message=message;
	}
	public String toString() {
		if(message!=null) {			
			return "A "+getShape()+""+getFlavour()+" Cake of "+getQuantity()+" is Ready with "+message+" message @ RS"+price*getQuantity()+"";
		}
		else {
			return super.toString();
		}
	}	
}
public class Cakeorder {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter shape");
    String shape=sc.nextLine();
    System.out.println("enter flavour");
    String flavour =sc.nextLine();
    System.out.println("quantity");
    int quantity=Integer.parseInt(sc.nextLine());
    System.out.println("enter message");
    String message=sc.nextLine();
    
    Cake c=new OrderedCake();
    System.out.println(c);
    c=new OrderedCake(shape,flavour,quantity);
    System.out.println(c);
    c=new OrderedCake(shape,flavour,quantity,message);
    System.out.println(c);
	}
	
   
	}
	
   
	

