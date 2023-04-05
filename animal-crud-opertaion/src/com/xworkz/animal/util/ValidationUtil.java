package com.xworkz.animal.util;

public class ValidationUtil {
	
	public static boolean validString(String value) {
		if(value != null && !value.isEmpty() && value.length() >3 && value.length()<30) {
			return true;
		}
		return false;
	}
	
	public static boolean validInt(int value) {
		if(value > 0 && value<100) {
			return true;
		}
		return false;
	}
	
	public static boolean validDouble(double value) {
		if(value >0.1 && value<150.5) {
			return true;
		}
		return false;
	}
	
	public static boolean validFlag(boolean... flags) {
		for(int index =0; index <flags.length; index++) {
			boolean temp= flags[index];
			if(!temp) {
				System.out.println("elements is false at index "+index);
				return false;
			}
		}
		return true;
		
	}

}
