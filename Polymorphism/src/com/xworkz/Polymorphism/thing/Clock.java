package com.xworkz.Polymorphism.thing;

public class Clock 
{
	private String shape="square";
	public double price;
	public Clock()
	{
		System.out.println("no-arg constructer in Clock class...");
	}
	
	public String getShape()
	{
		System.out.println("clock shape is : "+shape);
		return this.shape;
	}
	
	public void getPrice(double price)
	{
		this.price=price;
		System.out.println("Clock price is : "+price);
		
	}
	
}
