package com.xworkz.Concept.thing;

public class Cake {
	private String flower;
	private double weight;
	private String shape;
	private double price;

	public Cake(String flower, double weight, String shape, double price) {
		this.flower = flower;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Cake : " + obj);
		if (obj != null) {
			System.out.println("Object is not null...");
			if (obj instanceof Cake) {
				System.out.println("Obj is Cake type, compare it...");

				Cake cast = (Cake) obj;
				Cake cack1 = this;
				Cake cack2 = cast;

				if (cack1.flower.equals(cack2.flower) && cack1.weight == cack2.weight && cack1.shape.equals(cack2.shape)
						&& cack1.price == cack2.price) {
					System.out.println("both are same");
					return true;
				} else {
					System.out.println("Both are Not same");
				}
			} else {
				System.out.println("obj is not Cake type, not compared it");
			}
		} else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Runnung toString in Cake class");
		return "[Cake Flower is: " + flower + "] [cake price is: " + price + "] [cake weight is: " + weight
				+ "] [cake shape is: " + shape + "]";
	}
}
