package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.MetroCity;
import com.xworkz.inheritance.thing.Bengaluru;

public class MetroCityRunner {

	public static void main(String[] args) 
	{
		MetroCity metrocity=new MetroCity();
		metrocity.a2();
		MetroCity metro=new Bengaluru();
		metro.a2();
		Bengaluru bengaluru=new Bengaluru();
		bengaluru.a2();
	}

}
