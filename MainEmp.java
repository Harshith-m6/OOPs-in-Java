package com.rcb.Inheritance;

public class MainEmp {
	public static void main(String[] args) {
		FullTimeEmp e = new FullTimeEmp(101 , "Harshith",100000);
		ContractEmp c = new ContractEmp(102,"Abhi",1000.00 , 24);
		e.sal();
		c.sal();
		
	}

}
