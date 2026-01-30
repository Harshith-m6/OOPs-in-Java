package com.rcb.Inheritance;

public class BankSavings extends BankAcc {
	
	BankSavings(int amt)
	{
		super(amt);
	}
	
	public void withdraw(double amt)
	{
		if(amt<= getBal())
		{
			updateBal(-amt);
			System.out.println("Amount withdrawn from savings Account, current Balance is "+getBal());
		}else {
			System.out.println("Invalid withdrawl amount");
		}
	}
	

}
