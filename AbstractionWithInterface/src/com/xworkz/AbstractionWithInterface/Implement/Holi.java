package com.xworkz.AbstractionWithInterface.Implement;

import com.xworkz.AbstractionWithInterface.things.HoliRule;

public class Holi implements HoliRule{

	@Override
	public String dontUse() {
		
		return "Don't Use Egg, Ink and Other Harmful Material";
	}

	@Override
	public Boolean useNaturalColor() {
		
		return true;
	}

}
