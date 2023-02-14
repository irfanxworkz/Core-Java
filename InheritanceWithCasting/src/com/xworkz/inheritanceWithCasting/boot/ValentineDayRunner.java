package com.xworkz.inheritanceWithCasting.boot;
import com.xworkz.inheritanceWithCasting.thing.VelentineDay;
import com.xworkz.inheritanceWithCasting.thing.Feb14;

public class ValentineDayRunner {

	public static void main(String[] args) 
	{
		Feb14 feb=new Feb14();
		feb.saint();
		String string1=feb.getFeast();
		System.out.println(string1);
		
		VelentineDay valentine=new Feb14();
		String string2=valentine.getFeast();
		System.out.println(string2);
		
		Feb14 cast=(Feb14) valentine;
		cast.saint();
		

	}

}
