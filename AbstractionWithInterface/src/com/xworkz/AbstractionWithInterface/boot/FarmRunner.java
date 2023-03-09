package com.xworkz.AbstractionWithInterface.boot;

import com.xworkz.AbstractionWithInterface.Association.Farmer;
import com.xworkz.AbstractionWithInterface.Implement.Farm;
import com.xworkz.AbstractionWithInterface.things.FarmRule;

public class FarmRunner {

	public static void main(String[] args) {
		
		FarmRule farmrule=new Farm();
		boolean b1=farmrule.consumeLessWater();
		System.out.println("Consume Less Water :"+b1);
		boolean b2=farmrule.organicFarming();
		System.out.println("Organic Farming :"+b2);
		
		System.out.println("----------------------------------");
		
		Farmer farmer=new Farmer(farmrule);
		farmer.farmType();

	}
}
