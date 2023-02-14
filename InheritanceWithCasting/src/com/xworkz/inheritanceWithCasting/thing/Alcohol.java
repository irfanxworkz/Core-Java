package com.xworkz.inheritanceWithCasting.thing;

public class Alcohol
{
	private String type;
	
	public Alcohol()
	{
		System.out.println("no-arg Constructor from Alcohol class...");
	}
	public Alcohol(String type)
	{
		this.type=type;
		System.out.println(type);
	}
	
	public String getType()
	{
		return this.type;
	}
	
}
