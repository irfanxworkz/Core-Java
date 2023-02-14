package com.xworkz.inheritanceWithCasting.boot;
import com.xworkz.inheritanceWithCasting.thing.Sport;
import com.xworkz.inheritanceWithCasting.thing.Cricket;
public class SportRunner {

	public static void main(String[] args)
	{
		Cricket cricket=new Cricket("cricket");
		cricket.team();
		String name1=cricket.getName();
		System.out.println(name1);
		
		Sport sport=new Cricket("football");
		String name2=sport.getName();
		System.out.println(name2);
		
		Cricket cast=(Cricket) sport;
		cast.team();

	}

}
