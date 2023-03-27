package com.xworkz.weapon.util;

public class ValidationUtil {
	
	private ValidationUtil() {
		System.out.println("no-arg constructor in validationUtil");
	}

	public static boolean validString(String value) {
		if (value != null && value.length() > 3 && value.length() < 40) {
			return true;
		}
		return false;
	}

	public static boolean validId(int value1) {
		if (value1 > 0 && value1 < 1000) {
			return true;
		}
		return false;

	}

	public static boolean validPrice(double price) {
		if (price > 5000 && price < 1000000) {
			return true;
		}
		return false;
	}
		
		public static boolean validWeight(double price) {
			if (price > 0.5 && price < 20.5) {
				return true;
			}
			return false;

	}

	public static boolean valigFlag(boolean... flags) {
		boolean flag = true;
		for (int index = 0; index < flags.length; index++) {
			boolean temp = flags[index];
			if (!temp) {
				System.out.println("elements is false at index " + index);
				flag = false;
			}
		}
		return flag;
	}

}
