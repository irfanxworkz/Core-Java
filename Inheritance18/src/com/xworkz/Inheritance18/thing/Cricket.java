package com.xworkz.Inheritance18.thing;

public class Cricket extends Sport 
{
	private String country;
	private String name;
	
	public String getCountry(String country)
	{
		System.out.println("Country is: "+country);
		return this.country;
	}

	public String getCoachName(String name)
	{
		System.out.println("Coach Name is:"+name);
		return this.name;
	}

}
