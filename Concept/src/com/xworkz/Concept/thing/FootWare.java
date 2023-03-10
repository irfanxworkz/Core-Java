package com.xworkz.Concept.thing;

public class FootWare {
	private String brand;
	private int size;
	private String type;

	public FootWare(String brand, int size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in footware : " + obj);
		if (obj != null) {
			System.out.println("Object is not null...");
			if (obj instanceof FootWare) {
				System.out.println("Obj is Footware type, compare it...");

				FootWare cast = (FootWare) obj;
				FootWare foot1 = this;
				FootWare foot2 = cast;

				if (foot1.brand.equals(foot2.brand) && foot1.type == foot2.type && foot1.size == foot2.size) {
					System.out.println("both are same");
					return true;
				} else {
					System.out.println("Both are Not same");
				}
			} else {
				System.out.println("obj is not Footware type, not compared it");
			}
		} else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Running toString in FootWare class...");
		return "[FotWare Brand is:" + brand + "][ Footware Size is: " + size + "] [footware type is:" + type + "]";
	}
}
