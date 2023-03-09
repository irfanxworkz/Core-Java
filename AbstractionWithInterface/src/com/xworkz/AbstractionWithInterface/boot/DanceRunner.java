package com.xworkz.AbstractionWithInterface.boot;

import com.xworkz.AbstractionWithInterface.Association.DanceCompetitor;
import com.xworkz.AbstractionWithInterface.Implement.CompetitionOrganiser;
import com.xworkz.AbstractionWithInterface.things.DanceCompetitionRule;

public class DanceRunner {

	public static void main(String[] args) {
		
		DanceCompetitionRule dance=new CompetitionOrganiser();
		boolean b1=dance.soloDance();
		System.out.println("Solo Dance Allowed :"+b1);
		double d1=dance.durationInMin();
		System.out.println("Dance time Duration "+d1+" Min ");
		
		System.out.println("-------------------------------------------");
		
		DanceCompetitor dance1=new DanceCompetitor(dance);
		dance1.dance();
	}
}
