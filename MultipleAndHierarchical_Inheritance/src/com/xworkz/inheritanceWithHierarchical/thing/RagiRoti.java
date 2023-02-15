package com.xworkz.inheritanceWithHierarchical.thing;

public class RagiRoti extends Roti
{
	private int  calories=312;
	
	public RagiRoti()
	{
		System.out.println("no-arg constructor in RagiRoti class...");
	}
	
	public int getCalories()
	{
		System.out.println("calories in RagiRoti : "+calories);
		return this.calories;
		
	}
}
