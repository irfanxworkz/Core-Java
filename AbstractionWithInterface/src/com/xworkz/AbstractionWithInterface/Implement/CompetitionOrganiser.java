package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.DanceCompetitionRule;

public class CompetitionOrganiser implements DanceCompetitionRule {

	@Override
	public boolean soloDance() {
		
		return true;
	}

	@Override
	public double durationInMin() {
		double d1=10;
		System.out.println("Time Duration For Dance :"+d1+"Min");
		return d1;
	}

}
