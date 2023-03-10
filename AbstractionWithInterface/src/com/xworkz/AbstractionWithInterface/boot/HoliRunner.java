package com.xworkz.AbstractionWithInterface.boot;

import com.xworkz.AbstractionWithInterface.Association.HoliCelibrator;
import com.xworkz.AbstractionWithInterface.Implement.Holi;
import com.xworkz.AbstractionWithInterface.things.HoliRule;

public class HoliRunner {

	public static void main(String[] args) {
		
		HoliRule holi=new Holi();//Is-A realation
		
		System.out.println("------------------------------------");
		HoliCelibrator holiCelibrator=new HoliCelibrator(holi);//Has-A reation
		holiCelibrator.holiDisplay();

	}

}
