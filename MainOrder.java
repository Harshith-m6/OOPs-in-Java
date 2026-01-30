package com.rcb.Inheritance;

public class MainOrder {
	public static void main(String[] args) {
		Order o ;
		o = new Pizza(120);
		o.generateBill();
		
		o= new Biryani(200);
		o.generateBill();
	}

}
