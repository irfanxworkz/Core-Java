package com.xworkz.inheritanceWithHierarchical.thing;

public class GoldBangle extends Bangle
{
	private double price=315;
	
	public GoldBangle()
	{
		System.out.println("no-arg construter in GoldBangle class...");
	}
	
	public double getPrice()
	{
		return this.price;
	}
	

}