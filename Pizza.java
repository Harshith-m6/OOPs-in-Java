package com.rcb.Inheritance;

public class Pizza extends Order{
	private double charges =40;
	Pizza(double price )
	{
		super(price);
		
	}
	
	public double bill()
	{
		return getPrice()+this.charges;
	}

}
