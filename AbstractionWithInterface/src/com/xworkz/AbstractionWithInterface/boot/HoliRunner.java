package com.xworkz.AbstractionWithInterface.boot;

import com.xworkz.AbstractionWithInterface.Association.HoliCelibrator;
import com.xworkz.AbstractionWithInterface.Implement.Holi;
import com.xworkz.AbstractionWithInterface.things.HoliRule;

public class HoliRunner {

	public static void main(String[] args) {
		
		HoliRule holi=new Holi();//Is-A realation
		String str=holi.dontUse();
		System.out.println("Rule: "+str+" During Holi Celebration.");
		
		Boolean b1=holi.useNaturalColor();
		System.out.println("Rule : Used Only Natural Color :"+b1);
		
		System.out.println("------------------------------------");
		
		HoliCelibrator holiCelibrator=new HoliCelibrator(holi);//Has-A reation
		holiCelibrator.holiDisplay();

	}

}
