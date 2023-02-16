package com.xworkz.Polymorphism.thing;

public class Soil 
{
	private String organicMaterial="dead Plants";
	public Soil()
	{
		System.out.println("no-arg constructor in Soil class...");
	}
	
	public void color()
	{
		System.out.println("Soil color is brown");
	}
	public String getOrganicMaterial()
	{
		return this.organicMaterial;
	}
}
