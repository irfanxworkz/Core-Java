package com.xworkz.inheritanceWithCasting.thing;

public class Cricket extends Sport
{
	public Cricket(String name)
	{
		super(name);
		System.out.println("String constructor from Cricket class...");
	}
	public void team()
	{
		System.out.println("team method from Cricket class...");
	}
}
