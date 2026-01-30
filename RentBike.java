package com.rcb.Inheritance;

public class RentBike extends RentVehicle {
	
	RentBike(int basePrice)
	{
		super(basePrice);
	}
	
	void rent(int days)
	{
		System.out.println("Rent for bike is "+getBasePrice()*days);
	}

}
