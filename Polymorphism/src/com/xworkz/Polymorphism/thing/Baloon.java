package com.xworkz.Polymorphism.thing;

public class Baloon
{
	public String design="round";
	public Baloon()
	{
		System.out.println("no-arg constructor in Baloon class...");
	}
	
	public String getDesign()
	{
		System.out.println("Ballon design is: "+design);
		return this.design;
	}
	
	public void cost()
	{
		System.out.println("Baloon cost is low ");
	}


}
