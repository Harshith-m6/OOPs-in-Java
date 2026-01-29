package com.rcb.Inheritance;

public class Main3 {
	public static void main(String[] args) {
		Person p = new Harshith();
		if(p instanceof Harshith )
		{
			Harshith h = (Harshith)p;
			h.habit();
		}
	}

}
