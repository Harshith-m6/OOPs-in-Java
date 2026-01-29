package com.rcb.Inheritance;

public class Main1 {
	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.move();
		a.eat();
		a.sound();
		
		if( a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.sound();
		}
	}

}
