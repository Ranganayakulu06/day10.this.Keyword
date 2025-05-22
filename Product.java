package com.thisKeyword;

public class Product {
	private int id;
	private double price;
	
	public Product(int id, double price) {
		this.id=id;
		this.price=price;
	}
	public boolean isSame(Product p) {
		return this.id==p.id;
	}
	public static void main(String[] args) {
		Product product1 = new Product(100,29.99);
		Product product2 = new Product(105,25.56);
		Product product3 = new Product(100,26.44);
		
		System.out.println("product1 and product2 are same: "+ product1.isSame(product2));
		System.out.println("product1 and product3 are same: "+ product1.isSame(product3));
	}
}
