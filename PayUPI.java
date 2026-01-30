package com.rcb.Inheritance;

public class PayUPI extends Payment {
	
	PayUPI(double amount)
	{
		super(amount);
	}
	
	public void pay(double amt)
	{
		if(amt<=getAmount())
		{
			updateAmount(-amt);
			System.out.println("Amount debited successfully");
			System.out.println("Remaning balance is "+getAmount());
		}else {
			System.out.println("Invalid request no sufficient balance");
		}
		
	}
	

}
