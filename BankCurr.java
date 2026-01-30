package com.rcb.Inheritance;

public class BankCurr extends BankAcc {
	
	public BankCurr(double amt)
	{
		super(amt);
	}

	public void withdraw(double amt)
	{
		if(amt<100)
		{
			updateBal(-amt);
			System.out.println("Withdrawn from current Account , Current Balance is"+getBal());
		}else {
			System.out.println("Invalid amount");
		}
	}
}
