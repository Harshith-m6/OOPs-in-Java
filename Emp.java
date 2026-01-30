package com.rcb.Inheritance;

public abstract class Emp {
	private int id;
	private String name;
	private double sal;
	
	abstract void sal();
	
	Emp(int id , String name)
	{
		this.id=id;
		this.name = name;
	}

}
