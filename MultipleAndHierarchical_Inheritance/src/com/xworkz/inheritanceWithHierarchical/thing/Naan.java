package com.xworkz.inheritanceWithHierarchical.thing;

public class Naan extends ButterRoti
{
	private String type="Garlic Naan";
	
	public Naan()
	{
		System.out.println("no-arg Constructor in Naan class...");
	}
	
	public String getType()
	{
		return this.type;
	}
	
	
}
