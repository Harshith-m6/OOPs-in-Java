package com.rcb.Inheritance;

public abstract class BankAcc {
	private double bal;
	
	BankAcc(double bal)
	{
		if(bal>=1000)
		{
			this.bal=bal;
			System.out.println("Account created successfully");
		}else {
			throw new IllegalArgumentException("Minimum balance should be 1000");
		}
	}
	
	public void setBal(double amt)
	{
		this.bal+=amt;
	}
	
	public double getBal()
	{
		return this.bal;
	}
	
	public void updateBal(double amt)
	{
		this.bal+=amt;
	}
	
	abstract void withdraw(double amt);

}
