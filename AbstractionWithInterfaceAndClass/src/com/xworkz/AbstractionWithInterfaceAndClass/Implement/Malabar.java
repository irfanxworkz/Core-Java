package com.xworkz.AbstractionWithInterfaceAndClass.Implement;

import com.xworkz.AbstractionWithInterfaceAndClass.things.GoldSeller;

public class Malabar implements GoldSeller{

	@Override
	public double pricePerGram() {
		System.out.println("Gold Price From Malabar");
		return 5000;
	}

	@Override
	public String getGstNo() {
		String gstNo="15EXPTCS076";
		System.out.println("Malabar GST Number: "+gstNo);
		return gstNo;
	}

	@Override
	public String getLocation() {
		String location="Rajaji-Nagar";
		System.out.println("Malabar Location :"+location);
		return location;
	}

}
