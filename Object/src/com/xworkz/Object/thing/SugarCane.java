package com.xworkz.Object.thing;

public class SugarCane 
{
	private double price;
	private String material ;
	private String type;
	private String size;
	
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
	public void setSize(String size)
	{
		this.size=size;
	}
	
	@Override
	public int hashCode()
	{
		return 254; 
	}
	@Override
	public String toString()
	{
		
		System.out.println("Running toString in SugarCane...");
		return "SugerCane price is: "+price+" SugarCane material is: "+material+" SugarCane type is : "+type+" SugarCane Size is: "+size;

	}
}
