package com.rcb.Inheritance;

public class BankRef {
	
	public static void main(String[] args) {
		BankCurr bc = new BankCurr(1000);
		bc.withdraw(1100);
		BankSavings bs = new BankSavings(3000);
		bs.withdraw(600);
	}

}
