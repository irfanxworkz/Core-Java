package com.xworkz.Polymorphism.thing;

public class RedSoil extends Soil
{
	private String material="rock";
	public RedSoil()
	{
		System.out.println("no-arg constructor in RedSoil class....");
	}
	public String getMaterial()
	{
		return this.material;
	}

	public void color()
	{
		System.out.println("RedSoil color is Red");
	}
	

}
