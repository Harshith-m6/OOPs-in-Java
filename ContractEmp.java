
package com.rcb.Inheritance;

public class ContractEmp extends Emp {
	
	private double sal;
	private int days;
	
	public ContractEmp(int id , String name , double sal , int days)
	{
		super(id , name );
		this.sal = sal;
		this.days = days;
	}
	
	public void sal()
	{
		sal = sal*days;
		System.out.println("Contract Emp sal for working days "+sal);
	}

}
