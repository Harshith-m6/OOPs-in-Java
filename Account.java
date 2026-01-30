package com.rcb.Inheritance;

public class Account {
	
	private double balance;
	
	public void setBalance(double balance)
	{
		this.balance=this.balance+ balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void withdraw(double balance)
	{
		if(balance<0)
		{
			System.out.println("Low balance");
		}else {
			this.balance-=balance;
			System.out.println("balance is "+balance);
		}
	}
	
	

}
