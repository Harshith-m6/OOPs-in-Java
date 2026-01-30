package com.rcb.Inheritance;

public class PayMain {
	public static void main(String[] args) {
		Payment p ;
		p = new PayUPI(1000);
		p.pay(100);
		
		p = new PayCard(2000);
		p.pay(200);
	}

}
