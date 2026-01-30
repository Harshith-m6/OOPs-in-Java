package com.rcb.Inheritance;

public class RentMain {
	public static void main(String[] args) {
		RentVehicle v ;
		v = new RentCar(2000);
		v.rent(3);
		
		v= new RentBike(600);
		v.rent(2);
		
	}

}
