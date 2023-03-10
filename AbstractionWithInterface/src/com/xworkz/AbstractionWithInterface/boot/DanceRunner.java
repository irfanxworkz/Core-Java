package com.xworkz.AbstractionWithInterface.boot;

import com.xworkz.AbstractionWithInterface.Association.DanceCompetitor;
import com.xworkz.AbstractionWithInterface.Implement.CompetitionOrganiser;
import com.xworkz.AbstractionWithInterface.things.DanceCompetitionRule;

public class DanceRunner {

	public static void main(String[] args) {
		
		DanceCompetitionRule dance=new CompetitionOrganiser();
		
		System.out.println("-------------------------------------------");
		
		DanceCompetitor dance1=new DanceCompetitor(dance);
		dance1.dance();
	}
}
