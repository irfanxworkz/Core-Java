package com.xworkz.AbstractionWithInterface.boot;

import com.xworkz.AbstractionWithInterface.Association.CricketTeam;
import com.xworkz.AbstractionWithInterface.Implement.CricketBoard;
import com.xworkz.AbstractionWithInterface.things.CricketRule;

public class CricketRunner {

	public static void main(String[] args) {
		
		CricketRule cricketRule=new CricketBoard(); //Is-A relation
		boolean b=cricketRule.noBall();
		System.out.println("Ball is NoBall :"+b);
		
		boolean b1=cricketRule.out();
		System.out.println("Player is Out: "+b1);
		
		System.out.println("--------------------------------------------------------");
		
		CricketTeam cricketTeam=new CricketTeam(cricketRule); //Has-A relation
		
		cricketTeam.setPlayerName("KL Rahul");
		cricketTeam.getPlayerName();
		


	}

}
