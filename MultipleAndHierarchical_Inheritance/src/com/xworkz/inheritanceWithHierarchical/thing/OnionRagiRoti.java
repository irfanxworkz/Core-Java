package com.xworkz.inheritanceWithHierarchical.thing;

public class OnionRagiRoti extends RagiRoti
{
	public double weight=0.05;
	
	public OnionRagiRoti()
	{
		System.out.println("no-agr constructor in OnionRagiRoti class...");
	}
	
	public double getWeight()
	{
		System.out.println("RagiRoti weight is :"+weight);
		return this.weight;
	}
}
