package com.xworkz.Polymorphism.thing;

public class Puri extends PaniPuri
{
	public double price;
	public Puri()
	{
		System.out.println("no-arg constructor in Puri class...");
		
	}
	public void size()
	{
		System.out.println("Puri size is big");
	}
	
	public void price(double price)
	{
		this.price=price;
		System.out.println("Puri price is :"+price);
	}
}
