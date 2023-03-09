package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.DanceCompetitionRule;

public class CompetitionOrganiser implements DanceCompetitionRule {

	@Override
	public boolean soloDance() {
		
		return true;
	}

	@Override
	public double durationInMin() {
		
		return 10;
	}

}
