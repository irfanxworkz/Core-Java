package com.xworkz.Object.thing;

public class Coconut 
{
	private double price;
	private String size;
	private int quantity;
	private String material;
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setSize(String size)
	{
		this.size=size;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public void setMaterial(String material)
	{
		this.material=material;
	}
	
	@Override
	public int hashCode()
	{
		return 666; 
	}
	@Override
	public String toString() {
		
		System.out.println("Running toString in coconut ...");
		return " Coconut Price is: "+price+" Coconut Size is: "+size+" Coconut Quantity is: "+quantity+" Coconut Material is: "+material;
	}
}
