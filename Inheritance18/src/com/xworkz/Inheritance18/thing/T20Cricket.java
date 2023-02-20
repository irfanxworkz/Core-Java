package com.xworkz.Inheritance18.thing;

public class T20Cricket extends ODICricket
{
	private String sponsorName;
	
	public String getSponsorName(String sponsorName)
	{
		System.out.println("Sponsor is: "+sponsorName);
		return this.sponsorName;
	}
}
