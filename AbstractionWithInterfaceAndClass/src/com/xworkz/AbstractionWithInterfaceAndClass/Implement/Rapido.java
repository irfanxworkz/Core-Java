package com.xworkz.AbstractionWithInterfaceAndClass.Implement;

import com.xworkz.AbstractionWithInterfaceAndClass.things.Delivery;

public class Rapido implements Delivery {

	@Override
	public double charge() {
		System.out.println("charge from Rapido");
		return 50;
	}

	@Override
	public double timeTaken() {
		System.out.println("time taken from Rapido");
		return 40;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Agent Name from Rapido");
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
