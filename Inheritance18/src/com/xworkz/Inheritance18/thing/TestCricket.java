package com.xworkz.Inheritance18.thing;

public class TestCricket extends Cricket
{
	private String captainName;
	
	public String getCaptainName(String captainName)
	{
		System.out.println("Captain Name is :"+captainName);
		return this.captainName;
	}

}
