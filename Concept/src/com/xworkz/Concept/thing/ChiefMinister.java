package com.xworkz.Concept.thing;

public class ChiefMinister 
{
	private String name;
	private String state;
	private String party;
	private String homeTown;
	private String security;
	private int age;
	private int timePeriod;
	private int noOfMla;
	private int child;
	private int year;
	private double salary;
	private boolean married;
	private boolean currentTime;
	
	public ChiefMinister(String name, String state, String party, String homeTown, String security, int age,int timePeriod, int noOfMla, int child, int year, double salary, boolean married, boolean currentTime) 
	{
		this.name=name;
		this.state=state;
		this.party=party;
		this.homeTown=homeTown;
		this.security=security;
		this.age=age;
		this.timePeriod=timePeriod;
		this.noOfMla=noOfMla;
		this.child=child;
		this.year=year;
		this.salary=salary;
		this.married=married;
		this.currentTime=currentTime;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in ChiefMinister : "+obj);
		if(obj !=null)
		{
			System.out.println("Object is not null...");
			if(obj instanceof ChiefMinister)
			{
				System.out.println("Obj is ChiefMinister type, compare it...");
				
				ChiefMinister cast=(ChiefMinister) obj;
				ChiefMinister chief1=this;
				ChiefMinister chief2=cast;
				
				if(chief1.name.equals(chief2.name) 
						&& chief1.state.equals(chief2.state) 
						&& chief1.party.equals(chief2.party) 
						&& chief1.homeTown.equals(chief2.homeTown) 
						&& chief1.security.equals(chief2.security) 
						&& chief1.age==chief2.age						
						&& chief1.timePeriod==chief2.timePeriod
						&& chief1.noOfMla==chief2.noOfMla
						&& chief1.child==chief2.child
						&& chief1.year==chief2.year
						&& chief1.salary==chief2.salary
						&& chief1.married==chief2.married
						&& chief1.currentTime==chief2.currentTime
					)
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
				System.out.println("obj is not ChiefMinister type, not compared it");
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
		System.out.println("Running toString in ChiefMinister Class...");
		return "[ChiefMinister Name is: "+name+"] [ChiefMinister state is: "+state+"] [party is: "+party+"] [ HomeTown is: "+homeTown+"] [Security is: "+security+"] [ Age is:  "+age+"] [TimePeriod is :"+timePeriod+"] [ No of MLA is: "+noOfMla+"] [ Child is :"+child+"] [year is :"+year+"] [Salary is: "+salary+"] [Married :"+married+"] [Current Is :"+currentTime+"]";

	}
	

}
