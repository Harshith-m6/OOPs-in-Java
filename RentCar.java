package com.rcb.Inheritance;

public class RentCar extends RentVehicle {
	
	RentCar(int basePrice )
	{
		super(basePrice);
	}
	
	void rent(int days)
	{
		System.out.println("Gross rent is :"+days*getBasePrice());
	}

}
