package com.rcb.Inheritance;

public class Bank {
	
	public static void main(String[] args) {
		Account ac = new Account();
		
		ac.setBalance(1000);
		ac.withdraw(500);
		System.out.println("Balanace in the Account is :"+ac.getBalance());
	}

}
