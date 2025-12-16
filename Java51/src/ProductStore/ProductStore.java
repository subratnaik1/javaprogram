package ProductStore;
import java.util.*;
abstract class Product {
	private String name;
	private double price;
	private String catagory;

	Product(String name, double price, String catagory) {
		this.name = name;
		this.price = price;
		this.catagory = catagory;
	}

	public abstract void applyDiscount(double percentage);

	public abstract double calculateTax();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + ", catagory=" + catagory + "]";
	}
}

class DigitalProducts extends Product {
	private String licenseKey;

	DigitalProducts(String name, double price, String catagory, String licenseKey) {
		super(name, price, catagory);
		this.licenseKey = licenseKey;
	}

	public void applyDiscount(double percentage) {
		double discount;
		discount = getPrice() * percentage;
		double total = getPrice() - discount;
		setPrice(total);
		System.out.println("discount applied=" + discount);
		System.out.println("new price=" + total);
	}

	public double calculateTax() {
		return getPrice() * 0.05;
	}

	@Override
	public String toString() {
		return "DigitalProducts :\nProduct Name: "+getName()+"\nCategory: "+getCatagory()+"\nPrice RS:"+getPrice()+"\nLicense Key:"+licenseKey+"";
	}

}

class PhysicalProduct extends Product {
	private double shippingWeight;

	PhysicalProduct(String name, double price, String catagory, double shippingWeight) {
		super(name, price, catagory);
		this.shippingWeight = shippingWeight;
	}

	public void applyDiscount(double percentage) {
		double discount;
		discount = getPrice() * percentage/100;
		double total = getPrice() - discount;
		setPrice(total);
		System.out.println("discount price=" + discount);
		System.out.println("thoal price=" + total);
	}

	public double calculateTax() {
		return getPrice() * 0.08;
	}

	public double calculateShippingCost() {
		return shippingWeight * 5;
	}

	@Override
	public String toString() {
		return "PhysicalProduct :\nProduct Name:"+getName()+"Category:"+getCatagory()+"\nPrice RS:"+getPrice()+"\nShipping Weight:"+shippingWeight;
	}
	
}

public class ProductStore {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter choice");
     System.out.println("1. Digital Product");
     System.out.println("2. Physical Product");
     int choice=Integer.parseInt(sc.nextLine());
     
     if(choice==1) {  	 
    	 System.out.println("Enter Digital Product Name :");
    	 String name=sc.nextLine();
    	 System.out.println("enter the price");
    	 double price=Double.parseDouble(sc.nextLine());
    	 System.out.println("enter the catagory");
    	 String catagory=sc.nextLine();
    	 System.out.println("Enter Product License Key :");
    	 String licenseKey=sc.nextLine();
    	 System.out.println("Enter the discount % on final bill");
    	 double percentage=Double.parseDouble(sc.nextLine());
    	 Product p=new DigitalProducts(name,price,catagory,licenseKey);
    	 System.out.println(p);
    	 p.applyDiscount(percentage);
    	 p.calculateTax();
     }
     if(choice==2) {
    	 System.out.println("Enter Physical Product Name :");
    	 String name=sc.nextLine();
    	 System.out.println("Enter Product Price :");
    	 double price=Double.parseDouble(sc.nextLine());
    	 System.out.println("Enter Product Category :");
    	 String catagory=sc.nextLine();
    	 System.out.println("Enter Product weight :");
    	 double shippingWeight=Double.parseDouble(sc.nextLine());
    	 System.out.println("Enter the discount % on final bill");
    	 double percentage=Double.parseDouble(sc.nextLine());
    	 Product p=new PhysicalProduct(name,price,catagory,shippingWeight);
    	 System.out.println(p);
    	 p.applyDiscount(percentage);
    	 p.calculateTax();
         PhysicalProduct pp=(PhysicalProduct)p;
    	 System.out.println("Shipping cost "+pp.calculateShippingCost());
     }
     
    
	}

}
