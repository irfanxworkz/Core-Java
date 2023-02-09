package com.xworkz.assosiation.things;

public class Engineer 
{
	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degree;
	
	public Engineer()
	{
		System.out.println("creating no arg constructer...");
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setSkills(String[] skills)
	{
		this.skills=skills;
	}
	public void setDegree(Degree[] degree)
	{
		this.degree=degree;
	}
	
	public void display()
	{
		System.out.println("Engineer Name is:"+name);
		System.out.println(name+" Salary : "+salary);
		
		if(this.skills !=null)
		{
			for(int seq=0;seq<this.skills.length;seq++)
			{
				String element=this.skills[seq];
				System.out.println(name+" skills :"+element+" at index :"+seq);
			}
		}
		else
		{
			System.err.println("skills is null");
		}
		
		if(this.degree !=null)
		{
			for(int num=0;num<this.degree.length;num++)
			{
				Degree element=this.degree[num];
				System.out.println("at index :"+num);
				element.show();
			}
		}
		else
		{
			System.out.println("degree is null");
		}
	}
}
