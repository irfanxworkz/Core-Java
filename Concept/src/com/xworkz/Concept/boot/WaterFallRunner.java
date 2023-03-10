package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {

		WaterFall fall1 = new WaterFall("BalmuriFall", 122, "mysore");
		System.out.println(fall1);

		WaterFall fall2 = new WaterFall("BalmuriFall", 122, "mysore");
		System.out.println(fall2);

		WaterFall fall3 = new WaterFall("irruppa falls", 270, "near by mysore");
		System.out.println(fall3);

		boolean equal = fall1.equals(fall2);
		System.out.println(equal);

		boolean equal1 = fall2.equals(fall3);
		System.out.println(equal1);

		boolean equal2 = fall1.equals(fall3);
		System.out.println(equal2);
	}

}
