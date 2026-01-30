package com.rcb.Inheritance;

public class Main8 {
	public static void main(String[] args) {
		BankAccount bc = new BankAccount();
		
		bc.deposit(1000);
		bc.withdraw(200);
		System.out.println("Balance remaining :"+bc.getBal());
	}

}
