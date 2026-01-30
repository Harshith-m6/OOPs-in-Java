package com.rcb.Inheritance;

public interface ShowInterface {
	
	 default void show()
	{
		System.out.println("Interface is displayed");
	}

}
