package com.example.mybeans;

public class Product {
	String Prodname;
	int quantity;
	
	public Product(String Prodname,int quantity)
	{
		super();
		this.Prodname=Prodname;
		this.quantity=quantity;
	}

	@Override
	public String toString() {
		return "Product [Prodname=" + Prodname + ", quantity=" + quantity + "]";
	}	

}
