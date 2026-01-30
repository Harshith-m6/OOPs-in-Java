package com.rcb.Inheritance;

public class Youth {
	
	int age ;
	
	public void setAge(int age)
	{
		if(age>=18)
		{
			this.age +=age;
			System.out.println("Youth can vote");
		}else {
			System.out.println("Minor");
		}
	}

}
