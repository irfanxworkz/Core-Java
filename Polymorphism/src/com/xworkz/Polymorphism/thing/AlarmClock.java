package com.xworkz.Polymorphism.thing;

public class AlarmClock extends Clock
{
	public double price;
	private String type="Digital Watch";
	public AlarmClock()
	{
		System.out.println("no-arg constructer AlarmClock class...");
	}
	
	public String getType()
	{
		System.out.println("Alarm Clock type is: "+type);
		return this.type;
		//return "Digital watch";
	}
	public void getPrice(double price)
	{
		this.price=price;
		System.out.println("Alaram Clock price is :"+price);
	}
	
}
