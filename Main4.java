package com.rcb.Inheritance;

public class Main4 {
	public static void main(String[] args) {
		Employee[] emps = {new Engineer() , new Manager()};
		System.out.println("Raising Salary ------------");
		for(Employee e : emps)
		{
			e.raiseSalary();
		}
		System.out.println("Promotion ------------------ ");
		for(Employee e : emps)
		{
			e.promote();
		}
	}

}
