package com.rcb.Inheritance;

public class Students {
	private int age;
	Students(int age)
	{
		if(age>0)
		{
			this.age= age;
		}else {
			System.out.println("Invalid student age");
		}
	}
	
	public int getAge()
	{
		return this.age;
	}

}
