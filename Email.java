package com.rcb.Inheritance;

public class Email extends Message{
	
	Email(String message)
	{
		super(message);
	}

	@Override
	void notifictaion() {
		System.out.println("You have an Email "+getMessage());
	}

}
