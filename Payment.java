package com.rcb.Inheritance;

public abstract class Payment {
	private double amount;
	
	Payment(double amount)
	{
		this.amount = amount;
	}
	
	abstract void pay(double amt);
	
	public double getAmount()
	{
		return this.amount;
	}
	
	public void updateAmount(double amt)
	{
		this.amount-=amt;
	}
	
}
