package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.Alcohol;

public class AlcoholRunner {

	public static void main(String[] args) {
		Alcohol alcohol1 = new Alcohol("IB", 7, 4, "visky");
		System.out.println(alcohol1);

		Alcohol alcohol2 = new Alcohol("king", 3, 5, "Beer");
		System.out.println(alcohol2);

		Alcohol alcohol3 = new Alcohol("IB", 7, 4, "visky");
		System.out.println(alcohol3);

		boolean equal = alcohol1.equals(alcohol2);
		System.out.println(equal);

		boolean equal1 = alcohol2.equals(alcohol3);
		System.out.println(equal1);

		boolean equal2 = alcohol1.equals(alcohol3);
		System.out.println(equal2);

	}

}
