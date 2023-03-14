package com.xworkz.application.services.imp;

import java.time.LocalDate;

import com.xworkz.application.application.dto.ApplicationDTO;
import com.xworkz.application.application.dto.LangUsed;
import com.xworkz.application.application.dto.OsTypeSupported;
import com.xworkz.application.application.dto.Type;
import com.xworkz.application.services.ApplicationServices;

public class ApplicationServicesImp implements ApplicationServices {

	@Override
	public boolean validAndSave(ApplicationDTO dto) {
		System.out.println("ValidAndSave Method running...");
		if (dto != null) {
			System.out.println("dto in not null");

			String name = dto.getName();
			String developedBy = dto.getDevelopedBy();
			double version = dto.getVersion();
			double size = dto.getSize();
			double price = dto.getPrice();
			double minProcessorSpeed = dto.getMinProcessorSpeed();
			double minRamSpaceRequired = dto.getMinRamSpaceRequired();
			double rating = dto.getRating();
			double ageLimit = dto.getAgeLimit();
			Type type = dto.getType();
			LangUsed langUsed = dto.getLangUsed();
			OsTypeSupported osTypeSupportsd = dto.getOsTypeSupportsd();
			LocalDate createdDate = dto.getCreatedDate();
			LocalDate currentVersionReleaseDate = dto.getCurrentVersionReleaseDate();
			LocalDate firstVersionReleaseDate = dto.getFirstVersionReleaseDate();
			LocalDate nextVersionReleaseDate = dto.getNextVersionReleaseDate();
			int trialDays = dto.getTrialDays();
			boolean internetNeeded = dto.isInternetNeeded();
			int noOfDownload = dto.getNoOfDownloads();

			boolean validName = false;
			boolean validDevelopedBy = false;
			boolean validVersion = false;
			boolean validSize = false;
			boolean validPrice = false;
			boolean validMinProcessorSpeed = false;
			boolean validMinRamSpaceRequired = false;
			boolean validRating = false;
			boolean validAgeLimit = false;
			boolean validType = false;
			boolean validLangUsed = false;
			boolean validOsTypeSupportsd = false;
			boolean validCreatedDate = false;
			boolean validCurrentVersionReleaseDate = false;
			boolean validFirstVersionReleaseDate = false;
			boolean validNextVersionReleaseDate = false;
			boolean validTrialDays = false;
			boolean validInternetNeeded = false;
			boolean validNoOfDownloads = false;

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
				System.out.println("Name is valid...");
				validName = true;
			} 
			else {
				System.err.println("name is Invalid");
			}
			
			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() > 3
					&& developedBy.length() < 30) {
				System.out.println("DevelopedBy is valid...");
				validDevelopedBy = true;
			} 
			else {
				System.err.println("DevelopedBy is Invalid...");
			}
			
			if (version > 0 && version < 300) {
				System.out.println("Version is valid....");
				validVersion = true;
			} 
			else {
				System.err.println("Version is inValid...");
			}
			
			if (size > 0 && size < 5) {
				System.out.println("size is valid....");
				validSize = true;
			} 
			else {
				System.err.println("size is inValid...");
			}
			
			if (price > 0 && price < 1000) {
				System.out.println("price is valid....");
				validPrice = true;
			}
			else {
				System.err.println("price is inValid...");
			}
			
			if (minProcessorSpeed > 0 && minProcessorSpeed < 332) {
				System.out.println("minProcessorSpeed is valid....");
				validMinProcessorSpeed = true;
			} 
			else {
				System.err.println("minProcessorSpeed is inValid...");
			}
			
			if (minRamSpaceRequired > 0 && minRamSpaceRequired < 500) {
				System.out.println("minRamSpaceRequired is valid....");
				validMinRamSpaceRequired = true;
			} 
			else {
				System.err.println("minRamSpaceRequired is inValid...");
			}
			
			if (rating > 3 && rating < 6) {
				System.out.println("rating is valid....");
				validRating = true;
			} 
			else {
				System.err.println("rating is inValid...");
			}
			
			if (ageLimit > 16 && ageLimit < 45) {
				System.out.println("ageLimit is valid....");
				validAgeLimit = true;
			}
			else {
				System.err.println("ageLimit is inValid...");
			}
			
			if (type !=null) {
				System.out.println("type is valid....");
				validType = true;
			}
			else {
				System.err.println("type is inValid...");
			}
			
			if (langUsed !=null) {
				System.out.println("langUsed is valid....");
				validLangUsed = true;
			} 
			else {
				System.err.println("langUsed is inValid...");
			}
			
			if (osTypeSupportsd !=null) {
				System.out.println("osTypeSupportsd is valid....");
				validOsTypeSupportsd = true;
			} 
			else {
				System.err.println("osTypeSupportsd is inValid...");
			}
			
			LocalDate tomorrow = LocalDate.now().plusDays(1);
			LocalDate createDate = LocalDate.of(2009, 10, 6);
			
			if (createdDate !=null && createdDate.isBefore(tomorrow) && createdDate.isAfter(createDate)) {
				System.out.println("createdDate is valid....");
				validCreatedDate = true;
			} 
			else {
				System.err.println("createdDate is inValid...");
			}
			
			LocalDate currentVersionDate= LocalDate.of(2023, 3, 12);
			
			if (currentVersionReleaseDate !=null && currentVersionReleaseDate.equals(currentVersionDate)) {
				System.out.println("currentVersionReleaseDate is valid....");
				validCurrentVersionReleaseDate = true;
			}
			else {
				System.err.println("currentVersionReleaseDate is inValid...");
			}
			
			LocalDate firstVersionDate = LocalDate.of(2010, 10, 6);
			
			if (firstVersionReleaseDate !=null && firstVersionReleaseDate.equals(firstVersionDate)) {
				System.out.println("firstVersionReleaseDate is valid....");
				validFirstVersionReleaseDate = true;
			} 
			else {
				System.err.println("firstVersionReleaseDate is inValid...");
			}
			
			LocalDate nextVersionDate= LocalDate.of(2023, 10, 06);
			
			if (nextVersionReleaseDate !=null && nextVersionReleaseDate.equals(nextVersionDate)) {
				System.out.println("nextVersionReleaseDate is valid....");
				validNextVersionReleaseDate = true;
			}
			else {
				System.err.println("nextVersionReleaseDate is inValid...");
			}
			
			if (trialDays >0 && trialDays<35) {
				System.out.println("trialDays is valid....");
				validTrialDays = true;
			}
			else {
				System.err.println("trialDays is inValid...");
			}
			
			if (internetNeeded==true) {
				System.out.println("internetNeeded is valid....");
				validInternetNeeded = true;
			} 
			else {
				System.err.println("internetNeeded is inValid...");
			}
			
			if (noOfDownload >0 && noOfDownload<100) {
				System.out.println("noOfDownload is valid....");
				validInternetNeeded = true;
			} 
			else {
				System.err.println("noOfDownload is inValid...");
			}
			
			if(validName == true && validDevelopedBy == true && validVersion == true && validSize == true && validPrice == true && validMinProcessorSpeed == true && validMinRamSpaceRequired == true && validRating == true && validAgeLimit == true && validType == true && validLangUsed == true && validOsTypeSupportsd == true && validCreatedDate == true && validCurrentVersionReleaseDate == true && validFirstVersionReleaseDate == true && validNextVersionReleaseDate == true && validTrialDays == true && validInternetNeeded == true && validNoOfDownloads == true) {
				System.out.println("Validate Complete Data Save....");
				return true;
			}
			else {
				System.out.println("validate not Complete not save data ");
			}
			return true;
		}

		else {
			System.err.println("dto is null");
		}

		return false;

	}

}
