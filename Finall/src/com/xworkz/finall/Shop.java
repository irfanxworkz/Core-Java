package com.xworkz.finall;

public class Shop {
	private String name;
	private String type;
	private String location;
	private final String gstnumber = "gst1234gt";
	
	public Shop(String name,String type,String location)
	{
		this.name=name;
		this.type=type;
		this.location=location;
	}
	
	public void gstNumber()
	{
		System.out.println("Gst Numnber is :"+gstnumber);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Name is: "+name+"] [Type is: "+type+"] [location is: "+location+"] [gst number is: "+gstnumber+"]";
	}	
	
	public static void main(String[] args)
	{
		Shop shop=new Shop("Khandelwal general store","Kirana","Pratap nagar");
		System.out.println(shop);
		shop.gstNumber();
		
		Shop shop1=new Bakery();
		shop1.toString();
		System.out.println(shop1);
		shop1.gstNumber();
	}

}

class Bakery extends Shop
{
	public Bakery()
	{
		super("Bakery", "General Store", "Rajaji Nagar");
	}
}
