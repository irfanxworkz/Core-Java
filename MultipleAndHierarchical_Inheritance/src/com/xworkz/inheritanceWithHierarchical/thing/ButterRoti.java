package com.xworkz.inheritanceWithHierarchical.thing;

public class ButterRoti extends Roti
{
	private double length=5.6;
	
	public ButterRoti()
	{
		System.out.println("no-arg constructor in ButterRoti class...");
	}
	
	public double getLength()
	{
		return this.length;
	}
}
