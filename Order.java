package com.rcb.Inheritance;

public abstract class Order {
	
	private double price;
	abstract double bill();
	
	Order(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void generateBill()
	{
		System.out.println("Gross amount "+bill());
	}
	
	

}
