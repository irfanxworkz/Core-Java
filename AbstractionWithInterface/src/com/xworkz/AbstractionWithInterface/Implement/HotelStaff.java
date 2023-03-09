package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.EatingRule;

public class HotelStaff implements EatingRule {

	@Override
	public double eatingTime() {
		
		return 7;
	}

	@Override
	public boolean cleanPlate() {
		// TODO Auto-generated method stub
		return true;
	}

}
