package com.xworkz.inheritanceWithCasting.thing;

public class Sport 
{
	public String name;
	
	public Sport()
	{
		System.out.println("no-arg Constructer from Sport class...");
	}
	public Sport(String name)
	{
		this.name=name;
		System.out.println("String Constructer from Sport name is:"+name);
	}
	public String getName()
	{
		return this.name;
	}
}
