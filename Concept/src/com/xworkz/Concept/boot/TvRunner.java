package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.Tv;

public class TvRunner {

	public static void main(String[] args) {

		Tv tv1 = new Tv("Samsung", 45990, 55);
		System.out.println(tv1.toString());
		System.out.println("-----------");

		Tv tv2 = new Tv("Sony", 64590, 43);
		System.out.println(tv2);
		System.out.println("-----------");

		Tv tv3 = new Tv("Sony", 64590, 43);
		System.out.println(tv3);
		System.out.println("-----------");

		boolean equals = tv1.equals(tv3);
		System.out.println("both are same :" + equals);
		System.out.println("-----------");

		boolean equals1 = tv2.equals(tv3);
		System.out.println("both are Same :" + equals1);
		System.out.println("-----------");

	}

}
