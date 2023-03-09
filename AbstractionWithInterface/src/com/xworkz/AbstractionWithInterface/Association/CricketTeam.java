package com.xworkz.AbstractionWithInterface.Association;

import com.xworkz.AbstractionWithInterface.things.CricketRule;

public class CricketTeam {
	
	private String playerName;
	public CricketRule cricketteam;

	
	public CricketTeam(CricketRule cricketteam)
	{
		this.cricketteam=cricketteam;
		System.out.println("1-arg Constructor From CricketTeam");
		
	}
	
	public void setPlayerName(String playerName)
	{
		this.playerName=playerName;
	}
	public String getPlayerName()
	{
		boolean b1=cricketteam.noBall();
		System.out.println("Ball is NoBall :"+b1);
		
		boolean b2=cricketteam.out();
		System.out.println(playerName+" is Out: "+b2);
		return playerName;
	}
	

}
