package com.xworkz.AbstractionWithInterfaceAndClass.Implement;

import com.xworkz.AbstractionWithInterfaceAndClass.things.GoldSeller;

public class MahaLakshmi implements GoldSeller{

	@Override
	public double pricePerGram() {
		System.out.println("Gold Price From MahaLakshmi");
		return 4980;
	}

	@Override
	public String getGstNo() {
		String gstNo="12MTVHDHHS452";
		System.out.println("MahaLakshmi GST Number:"+gstNo);
		return gstNo;
	}

	@Override
	public String getLocation() {
		String location="Kurubarahalli";
		System.out.println("MahaLakshmi Location ");
		return location;
	}

}
