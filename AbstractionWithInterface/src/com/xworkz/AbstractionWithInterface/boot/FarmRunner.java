package com.xworkz.AbstractionWithInterface.boot;

import com.xworkz.AbstractionWithInterface.Association.Farmer;
import com.xworkz.AbstractionWithInterface.Implement.Farm;
import com.xworkz.AbstractionWithInterface.things.FarmRule;

public class FarmRunner {

	public static void main(String[] args) {
		
		FarmRule farmrule=new Farm();
		
		System.out.println("----------------------------------");
		Farmer farmer=new Farmer(farmrule);
		farmer.farmType();

	}
}
