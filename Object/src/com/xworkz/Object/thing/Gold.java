package com.xworkz.Object.thing;

public class Gold 
{
	private double price;
	private double weight ;
	private double density;
	private String color;
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	public void setDensity(double density)
	{
		this.density=density;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	
	@Override
	public int hashCode()
	{
		return 222; 
	}
	@Override
	public String toString()
	{
		
		System.out.println("Running toString in Gold...");
		return " Gold Price is :"+this.price+" Gold Weight is: "+this.weight+" Gold Density is: "+this.density+" Gold Color is: "+this.color;
	}
}
