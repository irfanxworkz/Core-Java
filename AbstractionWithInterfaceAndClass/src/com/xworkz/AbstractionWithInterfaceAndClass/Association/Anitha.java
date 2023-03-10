package com.xworkz.AbstractionWithInterfaceAndClass.Association;

import com.xworkz.AbstractionWithInterfaceAndClass.things.GoldSeller;

public class Anitha {
	
	private GoldSeller goldSeller;
	
	public Anitha(GoldSeller goldSeller)
	{
		this.goldSeller=goldSeller;
	}
	
	public void buyGold()
	{
		double d1=goldSeller.pricePerGram();
		if(d1<5000)
		{
			System.out.println("Anitha buy Will...");
		}
		goldSeller.getGstNo();
		goldSeller.getLocation();
	}

}
