package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.Park;

public class ParkRunner {

	public static void main(String[] args) {

		Park park1 = new Park("Public Park", "Kurubarahalli", 404, 6, true, true);
		System.out.println(park1);
		System.out.println("----------------------------------------------");

		Park park2 = new Park("private park", "kr puram", 204, 4, true, false);
		System.out.println(park2);
		System.out.println("----------------------------------------------");

		Park park3 = new Park("Public Park", "Kurubarahalli", 404, 6, true, true);
		System.out.println(park3);
		System.out.println("----------------------------------------------");

		boolean equals = park1.equals(park3);
		System.out.println("both are same :" + equals);
		System.out.println("-----------");

		boolean equals1 = park2.equals(park3);
		System.out.println("both are Same :" + equals1);
		System.out.println("-----------");
	}

}
