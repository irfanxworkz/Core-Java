package com.xworkz.Object.thing;

public class Pipe 
{
	private String brand;
	private double price;
	private int size;
	private String material;
	
	public void setBrand(String brand)
	{
		
		this.brand=brand;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setSize(int size)
	{
	      this.size=size;
	}
	
	public void setMaterial(String material)
	{
		this.material=material;
	}
	@Override
	public int hashCode() {
		return 555;
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Pipe...");
		return "Pipe Brand is: "+this.brand+" Pipe price is:"+this.price+" Pipe Size is :"+this.size+" Pipe material is: "+this.material;
	}
}
