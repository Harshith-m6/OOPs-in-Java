package com.rcb.Inheritance;

public class FullTimeEmp extends Emp {
	
	private double sal;
	
	FullTimeEmp(int id , String name , double sal)
	{
		super(id,name);
		this.sal = sal;
	}
	
	public void sal()
	{
		System.out.println("Full time emp monthly Salary is "+sal);
	}
	
	

}
