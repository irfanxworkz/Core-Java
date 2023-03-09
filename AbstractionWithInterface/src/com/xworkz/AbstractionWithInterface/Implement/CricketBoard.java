package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.CricketRule;

public class CricketBoard implements CricketRule {

	@Override
	public boolean noBall() {
		
		return false;
	}

	@Override
	public boolean out() {
	
		return true;
	}

}
