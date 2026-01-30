package com.rcb.Inheritance;

public abstract class RentVehicle {
	private int basePrice;
	
	abstract void rent(int days);
	
	public RentVehicle(int basePrice)
	{
		this.basePrice = basePrice;
	}
	
	public int getBasePrice()
	{
		return basePrice;
	}
	

}
