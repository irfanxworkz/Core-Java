package com.xworkz.Polymorphism.thing;

public class Garland
{
	public int size;
	public double price;
	public Garland()
	{
		System.out.println("no-arg constructor in Garland class...");
	}
	
	public void size(int size)
	{
		this.size=size;
		System.out.println("Garland size is : "+size);
	}
	
	public void price(double price)
	{
		this.price=price;
		System.out.println("Garland price is :"+price);
	}
}
