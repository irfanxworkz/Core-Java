package com.xworkz.assosiation.things;

public class Degree 
{
	public String name;
	public int duration;
	public boolean pursuing;
	public double percentage;
	public String branch;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	public void setPursuing(boolean pursuing)
	{
		this.pursuing=pursuing;
	}
	public void setPercentage(double percentage)
	{
		this.percentage=percentage;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	
	public void show()
	{ 
		System.out.println("Degree name :"+name);
		System.out.println("Degree duration :"+duration+" Year");
		System.out.println("Degree pursuing :"+pursuing);
		System.out.println("Degree percentage :"+percentage+"%");
		System.out.println("Degree branch :"+branch);
	}
}
