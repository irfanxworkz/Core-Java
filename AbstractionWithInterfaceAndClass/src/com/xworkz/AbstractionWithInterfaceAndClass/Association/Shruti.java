package com.xworkz.AbstractionWithInterfaceAndClass.Association;

import com.xworkz.AbstractionWithInterfaceAndClass.things.GoldSeller;

public class Shruti {

	private GoldSeller goldSeller;

	public Shruti(GoldSeller goldSeller) {
		this.goldSeller = goldSeller;
	}

	public void tinnaTago() {
		double d1 = goldSeller.pricePerGram();
		if (d1 < 4000) {
			System.out.println("Shruti Will buy...");
		}

		goldSeller.getGstNo();

		goldSeller.getLocation();

	}

}
