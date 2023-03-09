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
		double d1=eating.eatingTime();
		System.out.println("Dinner Time Is : "+d1+" PM");
		
		System.out.println("Plate is Clean :"+eating.cleanPlate());
	}
}
