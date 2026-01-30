package com.rcb.Inheritance;

public class PayCard extends Payment {
	
	PayCard(double amount)
	{
		super(amount);
	}
	
	void pay(double amt)
	{
		if(amt<=getAmount())
		{
			updateAmount(-amt);
			System.out.println("Amount debited successfully");
			System.out.println("Remaning balance is "+getAmount());
		}else {
			System.out.println("Insufficient amount");
		}
	}

}
