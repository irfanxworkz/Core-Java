package com.xworkz.Inheritance18.thing;

public class ODICricket extends Cricket
{
	private String groundName;
	
	public String getGroundName(String groundName)
	{
		System.out.println("ground is: "+groundName);
		return this.groundName;
	}
}
