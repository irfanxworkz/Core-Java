package com.xworkz.assosiation.things;

public class Hospital 
{
	public String name;
	public Doctor[] doctors;
	
	public Hospital()
	{
		System.out.println("Creating no arg constructor...");
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDoctor(Doctor[] doctors)
	{
		this.doctors=doctors;
	}
	
	public void display()
	{
		System.out.println("Hospital name :"+name);
		
		if(this.doctors !=null)
		{
			for(int num=0;num<this.doctors.length;num++)
			{
				Doctor element=this.doctors[num];
				System.out.println("at index :"+num);
				element.show();
			}
		}
		
	}
}
