package com.xworkz.inheritanceWithHierarchical.thing;

public class Kulcha extends Naan 
{
	public double size=4.5;
	
	public Kulcha()
	{
		System.out.println("no-arg constructor in Kulcha class...");
	}
	
	public double getSize()
	{
		return this.size;
	}

}
