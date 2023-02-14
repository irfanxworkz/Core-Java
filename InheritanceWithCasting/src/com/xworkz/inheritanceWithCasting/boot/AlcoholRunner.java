package com.xworkz.inheritanceWithCasting.boot;
import com.xworkz.inheritanceWithCasting.thing.Alcohol;
import com.xworkz.inheritanceWithCasting.thing.Whiskey;
public class AlcoholRunner {

	public static void main(String[] args) 
	{
		Whiskey whiskey=new Whiskey();
		whiskey.brand();
		String type=whiskey.getType();
		System.out.println(type);
	
		Alcohol alcohol=new Whiskey();
		String type1=alcohol.getType();
		System.out.println(type1);
		
		Whiskey cast=(Whiskey) alcohol;
		cast.brand();
	}

}
