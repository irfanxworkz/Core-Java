package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args)
	{
		PoliceStation police1=new PoliceStation("Rampura police Station",25,"60 feet road",977223565,"irfan@gmail.com","Ashok Kumar","Police","Bengaluru south",15,8);
		System.out.println(police1);
		System.out.println("----------------------------------------------");
		
		PoliceStation police2=new PoliceStation(" jaysingpura police staion",20,"Rajaji Nagar",976723565,"khan@gmail.com","praveen kumar","Police","bengaluru North",15,5);
		System.out.println(police2);
		System.out.println("----------------------------------------------");
		
		PoliceStation police3=new PoliceStation("Rampura police Station",25,"60 feet road",977223565,"irfan@gmail.com","Ashok Kumar","Police","Bengaluru south",15,8);
		System.out.println(police3);
		System.out.println("----------------------------------------------");
		
		boolean equals=police1.equals(police2);
		System.out.println("both are same :"+equals);
		System.out.println("-----------");
		
		boolean equals1=police1.equals(police3);
		System.out.println("both are Same :"+equals1);
		System.out.println("-----------");
	}

}
