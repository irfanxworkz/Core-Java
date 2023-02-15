package com.xworkz.inheritanceWithHierarchical.thing;

public class OnionMasalaRagiRoti extends OnionRagiRoti
{
	private double thickNess=0.02;
	
	public OnionMasalaRagiRoti()
	{
		System.out.println("no-arg constructor in OnionMasalaRagiRoti class...");
	}
	
	public double getThickNess()
	{
		return this.thickNess;
	}
}
