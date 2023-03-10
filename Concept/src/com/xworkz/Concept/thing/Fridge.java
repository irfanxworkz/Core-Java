package com.xworkz.Concept.thing;

public class Fridge {
	private String brand;
	private double price;
	private int doors;
	private String features;
	private double netWeight;
	private int warranty;
	private String defrost;
	private double totalDepth;
	private double totalWidth;
	private double totalHeight;
	private String refrigerant;
	private String tempratureController;

	public Fridge(String brand, double price, int doors, String features, double netWeight, int warranty,
			String defrost, double totalDepth, double totalWidth, double totalHeight, String refrigerant,
			String tempratureController) {
		this.brand = brand;
		this.price = price;
		this.doors = doors;
		this.features = features;
		this.netWeight = netWeight;
		this.warranty = warranty;
		this.defrost = defrost;
		this.totalDepth = totalDepth;
		this.totalWidth = totalWidth;
		this.totalHeight = totalHeight;
		this.refrigerant = refrigerant;
		this.tempratureController = tempratureController;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Fridge : " + obj);
		if (obj != null) {
			System.out.println("Object is not null...");
			if (obj instanceof Fridge) {
				System.out.println("Obj is Fridge type, compare it...");

				Fridge cast = (Fridge) obj;
				Fridge fridge1 = this;
				Fridge fridge2 = cast;

				if (fridge1.brand.equals(fridge2.brand) && fridge1.price == fridge2.price
						&& fridge1.doors == fridge2.doors && fridge1.features.equals(fridge2.features)
						&& fridge1.netWeight == fridge2.netWeight && fridge1.warranty == fridge2.warranty
						&& fridge1.defrost.equals(fridge2.defrost) && fridge1.totalDepth == fridge2.totalDepth
						&& fridge1.totalWidth == fridge2.totalWidth && fridge1.totalHeight == fridge2.totalHeight
						&& fridge1.refrigerant.equals(fridge2.refrigerant)
						&& fridge1.tempratureController.equals(fridge2.tempratureController)) {
					System.out.println("both are same");
					return true;
				} else {
					System.out.println("Both are Not same");
				}
			} else {
				System.out.println("obj is not Fridge type, not compared it");
			}
		} else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Fridge Class...");
		return "[brand is: " + brand + "] [price is: " + price + " ] [doors are :" + doors + "] [features is: "
				+ features + "] [weight is:" + netWeight + "] [Warranty is: " + warranty + "] [defrost is: " + defrost
				+ "] [depth is :" + totalDepth + "] [TotalWidth" + totalWidth + "] [Height is: " + totalHeight
				+ "] [refrigerant is:" + refrigerant + "] [Temprature Controller is:" + tempratureController + "]";
	}
}
