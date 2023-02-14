package com.xworkz.inheritanceWithCasting.thing;

public class Whiskey extends Alcohol
{
	public Whiskey()
	{
		super("whisky");
		System.out.println("String Constructer from Whiskey class...");
	}

	public void brand()
	{
		System.out.println("brand method from Whiskey class");
	}
}
