package com.xworkz.AbstractionWithInterfaceAndClass.Association;

import com.xworkz.AbstractionWithInterfaceAndClass.things.GoldSeller;

public class Priyanka {
	
	private GoldSeller goldSeller;
	
	public Priyanka(GoldSeller goldSeller)
	{
		this.goldSeller=goldSeller;
	}
	
	public void purchaseGold()
	{
		double d1=goldSeller.pricePerGram();
		if(d1<4500)
		{
			System.out.println("Priyanka Will Buy....");
		}
		
		goldSeller.getGstNo();
		goldSeller.getLocation();
	}

}
