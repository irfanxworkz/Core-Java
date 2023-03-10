package com.xworkz.AbstractionWithInterfaceAndClass.Association;

import com.xworkz.AbstractionWithInterfaceAndClass.things.Delivery;

public class Person {

	private Delivery delivery;
	
	public Person(Delivery delivery)
	{
		this.delivery=delivery;
	}
	
	public void display()
	{
	
	
		double d1=delivery.charge();
		if(d1<60)
		{
			System.out.println("Charge is Ok");
		}
		if(d1>60)
		{
			System.out.println("Charge are expenshive");
		}
		
		double d2=delivery.timeTaken();
		if(d2<=30)
		{
			System.out.println("ontime Delevry");
		}
		if(d2>30)
		{
			System.out.println("Delayed Delevery");
		}
		
		String str=delivery.agentName(2);
		System.out.println("Agent Name Is :"+str);
		
	}
}
