package com.xworkz.festival.util;

import java.time.LocalDate;

public class ValidationUtil {
	
	public static boolean validString(String value) {
		if (value != null && !value.isEmpty()&& value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}
	
	public static boolean validId(double id) {
		if(id>0 && id<500) {
			return true;
		}
		return false;
	}
	
	public static boolean validDate(LocalDate date) {
		LocalDate before = LocalDate.of(2024, 6, 12);
		LocalDate after = LocalDate.of(2022, 6, 12);
		if(date != null && date.isBefore(before) && date.isAfter(after)) {
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
