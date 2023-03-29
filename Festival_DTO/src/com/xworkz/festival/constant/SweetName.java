package com.xworkz.festival.constant;

public enum SweetName {

	KAJU_KATLI(1200) {
		public String color() {
			return "White and Yellow";
		}
	},
	KAJU_CHOCOLATE_CHAKRI(800) {
		public String color() {
			return "Chocolate and White";
		}
	},
	CHOCOLATE_BARFI(750) {
		public String color() {
			return "Chocolate";
		}
	},
	GAJAR_KA_HALWA(450) {
		public String color() {
			return "Red and Yellow";
		}
	},
	ANJEER_KA_HALWA(1300) {
		public String color() {
			return "Red and black";
		}
	},
	MOONG_DAL_HALWA(600) {
		public String color() {
			return "yellow";
		}
	},
	GUJIYA(450) {
		public String color() {
			return "Rose and Yellow";
		}
	},
	RABDI(800) {
		public String color() {
			return "Yellow";
		}
	},
	RASMALAI(750) {
		public String color() {

			return "Green";
		}
	},
	PEDA(350) {
		public String color() {
			return "White";
		}
	},
	COCONUT_LADDU(250) {
		public String color() {
			return "White";
		}
	},
	GULAB_JAMUN(450) {
		public String color() {
			return "Red";
		}
	},
	KALAKAND(500) {
		public String color() {
			return "White";
		}
	};

	public abstract String color();

	private final int price;
	
	private SweetName(int price) {
		this.price = price;

	}

	public int getPrice() {
		return price;
	}

};
