package com.xworkz.Object.thing;

public class Paint
{
	private String brand;
	private double price;
	private String color;
	private int quantity;
	
	public void setBrand(String brand)
	{
		
		this.brand=brand;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setColor(String color)
	{
	      this.color=color;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	@Override
	public int hashCode() {
		return 333;
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Paint...");
		return "Paint Brand is: "+this.brand+"Paint price is:"+this.price+"Paint color is :"+this.color+"Paint quantity is: "+this.quantity;
	}
}
