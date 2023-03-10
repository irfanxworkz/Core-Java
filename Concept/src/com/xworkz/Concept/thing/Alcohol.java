package com.xworkz.Concept.thing;

public class Alcohol {

	private String brand;
	private int percentage;
	private int height;
	private String type;

	public Alcohol(String brand, int percentage, int height, String type) {
		this.brand = brand;
		this.percentage = percentage;
		this.height = height;
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Alcohol class...");
		return "[Brand: " + brand + "][Percentage:" + percentage + "][Height: " + height + "][Type:" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(" running equals Methods in Alcohol " + obj);
		if (obj != null) {
			System.out.println("obj is not null");

			if (obj instanceof Alcohol) {
				Alcohol casted = (Alcohol) obj;
				Alcohol alcohol1 = this;
				Alcohol alcohol2 = casted;

				if (alcohol1.brand.equals(alcohol2.brand) && alcohol1.percentage == (alcohol2.percentage)
						&& alcohol1.height == alcohol2.height && alcohol1.type.equals(alcohol2.type)) {
					System.out.println("Both are same:");
					return true;
				} else {
					System.out.println("Both are not same");
				}
			} else {
				System.out.println("Alcohol1 is not alcohol type");

			}

		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
