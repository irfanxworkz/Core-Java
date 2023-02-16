package com.xworkz.Polymorphism.thing;

public class FoilBaloon extends Baloon
{
	private String shape="Star";
	public FoilBaloon()
	{
		System.out.println("no-arg constructor in Foilbaloon class...");
	}
	
	public String getShape()
	{
		return this.shape;
	}
	
	public void cost()
	{
		System.out.println("FoilBaloon Cost is High");
	}
}
