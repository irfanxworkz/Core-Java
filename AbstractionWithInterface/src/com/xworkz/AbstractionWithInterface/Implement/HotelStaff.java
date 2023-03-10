package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.EatingRule;

public class HotelStaff implements EatingRule {

	@Override
	public double eatingTime() {
		double d1=7;
		System.out.println("Dinner Time IS :"+d1);
		return d1;
	}

	@Override
	public boolean cleanPlate() {
		return true;
	}

}
