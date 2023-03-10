package com.xworkz.Concept.thing;

public class Fish {
	private String color;
	private String type;
	private double price;
	private double weight;
	private boolean alive;

	public Fish(String color, String type, double price, double weight, boolean alive) {
		this.color = color;
		this.type = type;
		this.price = price;
		this.weight = weight;
		this.alive = alive;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Fish : " + obj);
		if (obj != null) {
			System.out.println("Object is not null...");
			if (obj instanceof Fish) {
				System.out.println("Obj is Fish type, compare it...");

				Fish cast = (Fish) obj;
				Fish fish1 = this;
				Fish fish2 = cast;

				if (fish1.color.equals(fish2.color) && fish1.type.equals(fish2.type) && fish1.price == fish2.price
						&& fish1.weight == fish2.weight && fish1.alive == fish2.alive) {
					System.out.println("both are same");
					return true;
				} else {
					System.out.println("Both are Not same");
				}
			} else {
				System.out.println("obj is not Fish type, not compared it");
			}
		} else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Running tostring in Fish...");
		return "[color is: " + color + "] [Type is: " + type + "] [Price is : " + price + "] [weight is: " + weight
				+ "]";
	}

}
