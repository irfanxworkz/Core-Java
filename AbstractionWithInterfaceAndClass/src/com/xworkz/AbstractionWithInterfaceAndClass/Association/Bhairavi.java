package com.xworkz.AbstractionWithInterfaceAndClass.Association;

import com.xworkz.AbstractionWithInterfaceAndClass.things.GoldSeller;

public class Bhairavi {

	private GoldSeller goldSeller;
	
	public Bhairavi(GoldSeller goldSeller)
	{
		this.goldSeller=goldSeller;
	}
	
	public void bangaraKaridi()
	{
		double d1=goldSeller.pricePerGram();
		if((d1<6000)&&(d1>4500))
		{
			System.out.println("Anitha Will buy ");
		}
		goldSeller.getGstNo();
		goldSeller.getLocation();
	}
}
