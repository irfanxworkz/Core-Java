package com.xworkz.Multiple_Inheritance.implement;

import com.xworkz.Multiple_Inheritance.things.Developer;
import com.xworkz.Multiple_Inheritance.things.DubaiVisaRule;
import com.xworkz.Multiple_Inheritance.things.PassportRule;

public class Codes extends Developer implements PassportRule,DubaiVisaRule {

	

	@Override
	public double minAmount() {
		
		return 60000;
	}

	@Override
	public boolean stayingHotel() {
		
		return true;
	}

	@Override
	public double maxGoldLimit() {
		
		return 50;
	}

	@Override
	public String citizen() {
		
		return "Indian";
	}

	@Override
	public boolean criminalRecord() {
		
		return false;
	}

	@Override
	public boolean jail() {
	
		return false;
	}

	@Override
	public boolean followStanards() {
		return true;
		
	}

	@Override
	public boolean underStandingConcepts() {
		return true;
		
	}


}
