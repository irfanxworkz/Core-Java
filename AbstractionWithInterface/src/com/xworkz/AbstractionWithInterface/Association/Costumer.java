package com.xworkz.AbstractionWithInterface.Association;

import com.xworkz.AbstractionWithInterface.things.EatingRule;

public class Costumer {

	public EatingRule eating;
	
	public Costumer(EatingRule eating)
	{
		this.eating=eating;
	}
	
	public void food()
	{
		eating.eatingTime();
		boolean b1=eating.cleanPlate();
		System.out.println("Plate is Clean :"+b1);
	}
}
