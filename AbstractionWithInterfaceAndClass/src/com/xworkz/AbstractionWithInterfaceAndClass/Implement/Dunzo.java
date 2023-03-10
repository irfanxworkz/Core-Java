package com.xworkz.AbstractionWithInterfaceAndClass.Implement;

import com.xworkz.AbstractionWithInterfaceAndClass.things.Delivery;

public class Dunzo implements Delivery {

	@Override
	public double charge() {
		System.out.println("charge from Dunzo ");
		return 40;
	}

	@Override
	public double timeTaken() {
		System.out.println("Delevry time from Dunzo");
		return 55;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("AgentName From Dunzo");
		if(rating==1)
		{
			return "Basavaraj";
		}
		
		if(rating==2)
		{
			System.out.println("Rating is 2 from Dinakar");
			return "Dinakar";
		}
		if(rating==3)
		{
		
			return "Shiva";
		}
			return "Rating Not given";

	}

}
