package com.xworkz.assosiation.things;

public class Doctor 
{
	public String name;
	public String[] specilization;
	public double experience;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSpecilization(String[] specilization)
	{
		this.specilization=specilization;
	}
	public void setExperience(double experience)
	{
		this.experience=experience;
	}
	
	public void show()
	{
		System.out.println("Doctor Name :"+name);
		
		if(this.specilization !=null)
		{
			for(int seq=0;seq<this.specilization.length;seq++)
			{
				String element=this.specilization[seq];
				System.out.println(name+" specilization :"+element+"at index :"+seq);
			}
		}
		else
		{
			System.err.println("specipization is null");
		}
		
		System.out.println("Experience : "+experience+" year");
	}
}
