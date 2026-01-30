package com.rcb.Inheritance;

public class BankAccount {
	private double bal;
	
	public void deposit(double amt)
	{
		bal+=amt;
	}
	
	public void withdraw(double amt)
	{
		bal-=amt;
	}

	public double getBal()
	{
		return this.bal;
	}
}
