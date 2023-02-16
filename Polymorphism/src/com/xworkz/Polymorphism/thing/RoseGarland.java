package com.xworkz.Polymorphism.thing;

public class RoseGarland extends Garland
{
	public int quantity;
	public double price;
	public RoseGarland()
	{
		System.out.println("no-arg constructor in RoseGarland class...");
	}
	
	public void roseQuantity(int quantity)
	{
		this.quantity=quantity;
		System.out.println("Rose Quantity in RoseGarland is :"+quantity);
	}
	
	public void price(double price)
	{
		this.price=price;
		System.out.println("Rose Garland price is :"+price);
	}
}
