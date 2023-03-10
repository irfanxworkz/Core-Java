package com.xworkz.AbstractionWithInterface.boot;

import com.xworkz.AbstractionWithInterface.Association.Costumer;
import com.xworkz.AbstractionWithInterface.Implement.HotelStaff;
import com.xworkz.AbstractionWithInterface.things.EatingRule;

public class EatingRuleRunner {

	public static void main(String[] args) {
		
		EatingRule eating=new HotelStaff();
		
		System.out.println("------------------------------------------------");
		Costumer costumer=new Costumer(eating);
		costumer.food();

	}

}
