package com.rcb.Inheritance;

public abstract class Message {
	
	private String message;
	
	Message(String message)
	{
		this.message= message;
	}
	
	
	public  String getMessage()
	{
		return this.message;
	}
	
	abstract void notifictaion();

}
