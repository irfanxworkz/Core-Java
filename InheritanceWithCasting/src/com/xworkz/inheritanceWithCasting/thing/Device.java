package com.xworkz.inheritanceWithCasting.thing;

public class Device
{
	private String brand;
	
	public Device()
	{
		System.out.println("no-arg Constructor from Device class...");
	}
	public Device(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return this.brand;
	}
}
