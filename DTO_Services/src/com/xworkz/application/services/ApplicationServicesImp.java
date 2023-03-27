package com.xworkz.application.services;

import java.time.LocalDate;

import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.OsTypeSupported;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepository;

import static com.xworkz.application.util.ValidationUtil.*;

public class ApplicationServicesImp implements ApplicationServices {
	
	private ApplicationRepository applicationRepository;
	
	

	public ApplicationServicesImp(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}



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
			int noOfDownload = dto.getNoOfDownloads();
			boolean internetNeeded = dto.isInternetNeeded();

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

			if (validString(name)) {
				System.out.println("Name is valid...");
				validName = true;
			} 
			else {
				System.err.println("name is Invalid");
			}
			
			if (validString(developedBy)) {
				System.out.println("DevelopedBy is valid...");
				validDevelopedBy = true;
			} 
			else {
				System.err.println("DevelopedBy is Invalid...");
			}
			
			if (validVersion(version)) {
				System.out.println("Version is valid....");
				validVersion = true;
			} 
			else {
				System.err.println("Version is inValid...");
			}
			
			if (validSize(size)) {
				System.out.println("size is valid....");
				validSize = true;
			} 
			else {
				System.err.println("size is inValid...");
			}
			
			if (validPrice(price)) {
				System.out.println("price is valid....");
				validPrice = true;
			}
			else {
				System.err.println("price is inValid...");
			}
			
			if (validMinProcessorSpeed(minProcessorSpeed)) {
				System.out.println("minProcessorSpeed is valid....");
				validMinProcessorSpeed = true;
			} 
			else {
				System.err.println("minProcessorSpeed is inValid...");
			}
			
			if (validMinRamSpaceRequired(minRamSpaceRequired)) {
				System.out.println("minRamSpaceRequired is valid....");
				validMinRamSpaceRequired = true;
			} 
			else {
				System.err.println("minRamSpaceRequired is inValid...");
			}
			
			if (validRating(rating)) {
				System.out.println("rating is valid....");
				validRating = true;
			} 
			else {
				System.err.println("rating is inValid...");
			}
			
			if (validAgeLimit(ageLimit)) {
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
			
			
			if (validCreatedDate(createdDate)) {
				System.out.println("createdDate is valid....");
				validCreatedDate = true;
			} 
			else {
				System.err.println("createdDate is inValid...");
			}
			
			
			if (validCurrentVersionReleaseDate(currentVersionReleaseDate)) {
				System.out.println("currentVersionReleaseDate is valid....");
				validCurrentVersionReleaseDate = true;
			}
			else {
				System.err.println("currentVersionReleaseDate is inValid...");
			}
			
			
			
			if (validFirstVersionReleaseDate(firstVersionReleaseDate)) {
				System.out.println("firstVersionReleaseDate is valid....");
				validFirstVersionReleaseDate = true;
			} 
			else {
				System.err.println("firstVersionReleaseDate is inValid...");
			}
			
			
			
			if (validNextVersionReleaseDate(nextVersionReleaseDate)) {
				System.out.println("nextVersionReleaseDate is valid....");
				validNextVersionReleaseDate = true;
			}
			else {
				System.err.println("nextVersionReleaseDate is inValid...");
			}
			
			if (validTrialDays(trialDays)) {
				System.out.println("trialDays is valid....");
				validTrialDays = true;
			}
			else {
				System.err.println("trialDays is inValid...");
			}
			
			if (validNoOfDownload(noOfDownload)) {
				System.out.println("noOfDownload is valid....");
				validNoOfDownloads = true;
			} 
			else {
				System.err.println("noOfDownload is inValid...");
			}
			
			if (internetNeeded) {
				System.out.println("internetNeeded is valid....");
				validInternetNeeded = true;
			} 
			else {
				System.err.println("internetNeeded is inValid...");
			}
			
			
			if(validFlag(validName, validDevelopedBy, validVersion, validSize, validPrice, validMinProcessorSpeed, validMinRamSpaceRequired, validRating, validAgeLimit, validType, validLangUsed, validOsTypeSupportsd, validCreatedDate, validCurrentVersionReleaseDate, validFirstVersionReleaseDate, validNextVersionReleaseDate, validTrialDays, validInternetNeeded, validNoOfDownloads)) {
				System.out.println("Validate Complete Data Save....");
				boolean saved=applicationRepository.save(dto);
				return saved;
			}
			else {
				System.out.println("validate not Complete not save data ");
			}
			return false;
		}

		else {
			System.err.println("dto is null");
		}

		return false;

	}

}
