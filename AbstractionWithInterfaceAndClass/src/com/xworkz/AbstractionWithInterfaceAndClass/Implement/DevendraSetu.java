package com.xworkz.AbstractionWithInterfaceAndClass.Implement;

import com.xworkz.AbstractionWithInterfaceAndClass.things.GoldSeller;

public class DevendraSetu implements GoldSeller{

	@Override
	public double pricePerGram() {
		System.out.println("Gold Price From DevendraSetu");
		return 4950;
	}

	@Override
	public String getGstNo() {
		String gstNo="15MXPTVG086";
		System.out.println("DevendraSetu GST Number :"+gstNo);
		return gstNo;
	}

	@Override
	public String getLocation() {
		String location="Bhasvashara-Nagar";
		System.out.println("DevendraSetu Location : "+location);
		return location;
	}

}
