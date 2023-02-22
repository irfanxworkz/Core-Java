package com.xworkz.Concept.thing;

public class WaterFall 
{
	private String  name;
	private int height;
	private String location;
	
	public WaterFall(String name, int height, String location) 
	{
		this.name = name;
		this.height = height;
		this.location = location;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Running equals in WaterFalls : "+obj);
		if(obj !=null)
		{
			System.out.println("Object is not null...");
			if(obj instanceof WaterFall)
			{
				System.out.println("Obj is Tv type, compare it...");
				
				WaterFall cast=(WaterFall) obj;
				WaterFall fall1=this;
				WaterFall fall2=cast;
				
				if(fall1.name.equals(fall2.name) 
						&& fall1.height==fall2.height
						&& fall1.location.equals(fall2.location))
				{
					System.out.println("both are same");
					return true;
				}
				else
				{
					System.out.println("Both are Not same");
				}
			}
			else
			{
				System.out.println("obj is not WaterFall type, not compared it");
			}
		}
		else
		{
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
			System.out.println("Runnung toStsing in Waterfalls...");
		return "[Name: " + name + "][Height: " +height + "][Location: " +location + "]";
	}
	
}
