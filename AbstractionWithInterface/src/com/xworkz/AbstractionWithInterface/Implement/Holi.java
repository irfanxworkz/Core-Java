package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.HoliRule;

public class Holi implements HoliRule{

	@Override
	public String dontUse() {
		String str="Don't Use Egg, Ink and Other Harmful Material";
		System.out.println("Rule: "+str);
		return str;
	}

	@Override
	public Boolean useNaturalColor() {
		
		return true;
	}

}
