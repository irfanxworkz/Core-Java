package com.xworkz.inheritanceWithHierarchical.thing;

public class JowerRoti extends ButterRoti
{
	private double price=315;
	
	public JowerRoti()
	{
		System.out.println("no-arg constructer in JowerRoti class...");
	}
	
	public double getPrice()
	{
		return this.price;
	}
}
