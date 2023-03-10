package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish1 = new Fish("Gray", "Salmon Fish", 350, 1, false);
		System.out.println(fish1);
		System.out.println("-----------------------------------------");

		Fish fish2 = new Fish("Gray", "Salmon Fish", 350, 1, false);
		System.out.println(fish2);
		System.out.println("-----------------------------------------");

		Fish fish3 = new Fish("Silver", "Rohu Fish", 500, 2, true);
		System.out.println(fish3);
		System.out.println("-----------------------------------------");

		boolean equals = fish1.equals(fish2);
		System.out.println("both are same :" + equals);
		System.out.println("-----------");

		boolean equals1 = fish2.equals(fish3);
		System.out.println("both are Same :" + equals1);
		System.out.println("-----------");

	}

}
