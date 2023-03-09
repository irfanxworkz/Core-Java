package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.FarmRule;

public class Farm implements FarmRule {

	@Override
	public boolean consumeLessWater() {

		return true;
	}

	@Override
	public boolean organicFarming() {
	
		return true;
	}

}
