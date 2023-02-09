package com.xworkz.assosiation.things;
public class Scientest 
{
	public String name;
	public String designation;
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public void setdesignation(String designation)
	{
		this.designation=designation;
	}
	
	public void show()
	{
		System.out.println("Scientest name:"+name);
		System.out.println("Scientest designation:"+designation);
	}
}