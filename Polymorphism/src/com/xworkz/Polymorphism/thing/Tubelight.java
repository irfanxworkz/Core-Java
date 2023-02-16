package com.xworkz.Polymorphism.thing;

public class Tubelight
{
	public double price;
	
	public Tubelight()
	{
		System.out.println("no-arg constructor in Tubelight class...");
	}
	
	public void shape()
	{
		System.out.println("Tubelight shape is round");
	}
	public void price(double price)
	{
		this.price=price;
		System.out.println("Tubelight Price is : "+price);
	}
}