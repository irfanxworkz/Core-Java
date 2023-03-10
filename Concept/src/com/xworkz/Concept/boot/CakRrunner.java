package com.xworkz.Concept.boot;

import com.xworkz.Concept.thing.Cake;

public class CakRrunner {

	public static void main(String[] args) {

		Cake cake1 = new Cake("Chocolate", 450, "Round", 350);
		System.out.println(cake1);

		Cake cake2 = new Cake("Chocolate", 450, "Round", 350);
		System.out.println(cake2);

		Cake cake3 = new Cake("Resberry", 600, "Heart", 550);
		System.out.println(cake3);

		boolean equal = cake1.equals(cake2);
		System.out.println(equal);

		boolean equal1 = cake1.equals(cake3);
		System.out.println(equal1);

	}

}
