package com.xworkz.AbstractionWithInterfaceAndClass.Implement;

import com.xworkz.AbstractionWithInterfaceAndClass.things.GoldSeller;

public class Abharan implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Gold Price From Abharan");
		return 4870;
	}

	@Override
	public String getGstNo() {
		String gstNo="15CSGLDUV056";
		System.out.println("Abharan GST Number:"+gstNo);
		return gstNo;
	}

	@Override
	public String getLocation() {
		String location="Shivaji-Nagar";
		System.out.println("Abharan Location :"+location);
		return location;
	}
}
