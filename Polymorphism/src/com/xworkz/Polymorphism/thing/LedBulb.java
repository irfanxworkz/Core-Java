package com.xworkz.Polymorphism.thing;

public class LedBulb extends Tubelight
{
	public double price;
	
	public LedBulb()
	{
		System.out.println("no-arg constructor in LedBulb class...");
	}
	public void size()
	{
		System.out.println("Led Bulb size is small");
	}
	public void price(double price)
	{
		this.price=price;
		System.out.println("Led Bulb price is :"+price);
		
	}
}
