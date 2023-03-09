package com.xworkz.AbstractionWithInterface.Association;

import com.xworkz.AbstractionWithInterface.things.FarmRule;

public class Farmer {
	
	public FarmRule farmer;
	
	public Farmer(FarmRule farmer)
	{
		this.farmer=farmer;
	}
	
	public void farmType()
	{
		System.out.println("Consume Less Water :"+farmer.consumeLessWater());
		System.out.println("Organic Farming :"+farmer.organicFarming());
	}

}
