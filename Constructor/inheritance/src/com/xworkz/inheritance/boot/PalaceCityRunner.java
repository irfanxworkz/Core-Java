package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.PlaceCity;
import com.xworkz.inheritance.thing.Mysore;

public class PalaceCityRunner {

	public static void main(String[] args)
	{
		PlaceCity p1=new PlaceCity();
		p1.b1();
		PlaceCity p2=new Mysore();
		p2.b1();
		Mysore p3=new Mysore();
		p3.b1();
	}

}
