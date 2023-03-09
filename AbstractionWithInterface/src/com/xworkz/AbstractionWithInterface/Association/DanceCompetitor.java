package com.xworkz.AbstractionWithInterface.Association;

import com.xworkz.AbstractionWithInterface.things.DanceCompetitionRule;

public class DanceCompetitor {
	
	public DanceCompetitionRule competitor;
	
	public DanceCompetitor(DanceCompetitionRule competitor)
	{
		this.competitor=competitor;
	}

	public void dance()
	{
		boolean b1=competitor.soloDance();
		System.out.println("Solo Dance : "+b1);
		double d1=competitor.durationInMin();
		System.out.println("Dance time Duration : "+d1+" Min");
	}
	
}
