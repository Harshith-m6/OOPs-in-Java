package com.rcb.Inheritance;

public class Biryani extends Order {
	private double charges = 50;
	Biryani(double price)
	{
		super(price);
		
	}
	
	public double bill()
	{
		return getPrice()+this.charges;
	}
	
	

}
