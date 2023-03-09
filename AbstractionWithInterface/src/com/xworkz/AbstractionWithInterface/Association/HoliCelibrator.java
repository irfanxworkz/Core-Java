package com.xworkz.AbstractionWithInterface.Association;

import com.xworkz.AbstractionWithInterface.things.HoliRule;

public class HoliCelibrator {
	
	public HoliRule holirule;
	
	public HoliCelibrator(HoliRule holirule)
	{
		this.holirule=holirule;
	}
	
	public void holiDisplay()
	{
		System.out.println("HolyCelibrator "+holirule.dontUse());
		System.out.println("HolyCelibrator Only Used Natural Color : "+holirule.useNaturalColor());
	}

}
