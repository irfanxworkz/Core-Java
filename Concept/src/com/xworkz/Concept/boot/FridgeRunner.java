package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.Fridge;

public class FridgeRunner 
{
	public static void main(String[] args)
	{
		Fridge fridge1=new Fridge("LG", 55000, 2, "Energy Efficiency", 47, 5, "Automatic", 65.5, 61.8, 169, "R134a", "High");
		System.out.println(fridge1);
		System.out.println("-----------");
		
		Fridge fridge2=new Fridge("LG", 55000, 2, "Energy Efficiency", 47, 5, "Automatic", 65.5, 61.8, 169, "R134a", "High");
		System.out.println(fridge2);
		System.out.println("-----------");
		
		Fridge fridge3=new Fridge("Samsung", 45000, 2, "Energy Efficiency", 47, 5, "Automatic",  53.5, 65.8, 156, "R134b", "Medium");
		System.out.println(fridge3);
		System.out.println("-----------");
		
		boolean equals=fridge1.equals(fridge2);
		System.out.println("both are same :"+equals);
		System.out.println("-----------");
		
		boolean equals1=fridge2.equals(fridge3);
		System.out.println("both are Same :"+equals1);
		System.out.println("-----------");
	}
}
