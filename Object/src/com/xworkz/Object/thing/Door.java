package com.xworkz.Object.thing;

public class Door
{
	private double price;
	private String material ;
	private String type;
	private int size;
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setMaterial(String material)
	{
		this.material=material;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public void setSize(int size)
	{
		this.size=size;
	}
	
	@Override
	public int hashCode()
	{
		return 444; 
	}
	@Override
	public String toString()
	{
		
		System.out.println("Running toString in Door...");
		return "Door price is: "+price+" Door material is: "+material+" Door type is : "+type+" Door material is: "+size;
	}
}
