package com.subrat.argument;

class Product {
	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class ProductArrayDemo {
	void main() {
		int size=Integer.parseInt(IO.readln("enter number of products"));
        Product p[]=new Product[size];
        int count=1;
		for(int i=0;i<size;i++) {
			IO.println("Enter details for Product "+count);
			int id=Integer.parseInt(IO.readln("enter product ID :"));
			String name=IO.readln("enter name");
			double price=Double.parseDouble(IO.readln("enter product price"));
			count++;
			p[i]=new Product(id,name,price);
		}
		
		int find=Integer.parseInt(IO.readln("Enter Product ID to search: "));
		boolean flag=false;
		for(Product pp:p) {
			if(pp.getId()==find) {
				IO.println("product found: "+pp);
				flag =true;
				return;
			}
		}
		if(flag==false) {
			IO.println("Product with ID "+find+" not found");
		}
	}
}
