package com.xworkz.Concept.thing;

public class Tv {
	private String brand;
	private double price;
	private int size;

	public Tv(String brand, double price, int size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	@Override
	public boolean equals(Object obj) {

		System.out.println("Running equals in Tv : " + obj);
		if (obj != null) {
			System.out.println("Object is not null...");
			if (obj instanceof Tv) {
				System.out.println("Obj is Tv type, compare it...");

				Tv cast = (Tv) obj;
				Tv tv1 = this;
				Tv tv2 = cast;

				if (tv1.brand.equals(tv2.brand) && tv1.price == tv2.price && tv1.size == tv2.size) {
					System.out.println("both are same");
					return true;
				} else {
					System.out.println("Both are Not same");
				}
			} else {
				System.out.println("obj is not Tv type, not compared it");
			}
		} else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Tv class...");
		return "[Brand :" + this.brand + "] [Price :" + this.price + "] [Size :" + this.size + "] ";
	}
}
