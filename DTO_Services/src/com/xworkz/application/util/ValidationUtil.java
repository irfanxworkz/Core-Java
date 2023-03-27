package com.xworkz.application.util;

import java.time.LocalDate;

public class ValidationUtil {
	
	private ValidationUtil() {
		System.out.println("no-arg constructor in validationUtil");
	}

	public static boolean validString(String value) {
		if (value != null && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}
	
	public static boolean validVersion(double version) {
		if (version >1.2 && version < 16.2) {
			return true;
		}
		return false;
	}


	public static boolean validSize(double size) {
		if (size > 0 && size < 100000) {
			return true;
		}
		return false;

	}
	
	public static boolean validPrice(double price) {
		if (price > 1000 && price < 100000) {
			return true;
		}
		return false;

	}
	
	public static boolean validMinProcessorSpeed(double minProcessorSpeed) {
		if (minProcessorSpeed > 2.5 && minProcessorSpeed < 55.5) {
			return true;
		}
		return false;

	}
	
	public static boolean validMinRamSpaceRequired(double minRamSpaceRequired) {
		if (minRamSpaceRequired > 2 && minRamSpaceRequired < 32) {
			return true;
		}
		return false;

	}
	
	public static boolean validRating(double rating) {
		if (rating > 3.5 && rating < 5.1) {
			return true;
		}
		return false;

	}

	public static boolean validAgeLimit(double ageLimit) {
		if (ageLimit > 18 && ageLimit < 55) {
			return true;
		}
		return false;

	}
	
	public static boolean validTrialDays(int trialDays) {
		if (trialDays > 0 && trialDays < 30) {
			return true;
		}
		return false;

	}
	
	public static boolean validNoOfDownload(int noOfDownload) {
		if (noOfDownload > 0 && noOfDownload < 100) {
			return true;
		}
		return false;

	}

	public static boolean validCreatedDate(LocalDate createdDate) {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		LocalDate createDate = LocalDate.of(2009, 10, 6);
		if (createdDate !=null && createdDate.isBefore(tomorrow) && createdDate.isAfter(createDate)) {
			return true;
		}
		return false;
	}
	
	public static boolean validCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		LocalDate currentVersionDate= LocalDate.of(2023, 3, 12);
		if (currentVersionReleaseDate !=null && currentVersionReleaseDate.equals(currentVersionDate)) {
			return true;
		}
		return false;
	}
	
	public static boolean validFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		LocalDate firstVersionDate = LocalDate.of(2010, 10, 6);
		if (firstVersionReleaseDate !=null && firstVersionReleaseDate.equals(firstVersionDate)) {
			return true;
		}
		return false;
	}
	
	public static boolean validNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		LocalDate nextVersionDate= LocalDate.of(2023, 10, 06);
		if (nextVersionReleaseDate !=null && nextVersionReleaseDate.equals(nextVersionDate)) {
			return true;
		}
		return false;
	}


	public static boolean validFlag(boolean... flags) {
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
