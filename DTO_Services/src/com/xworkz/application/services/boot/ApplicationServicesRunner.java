package com.xworkz.application.services.boot;

import java.time.LocalDate;

import com.xworkz.application.application.dto.ApplicationDTO;
import com.xworkz.application.application.dto.LangUsed;
import com.xworkz.application.application.dto.OsTypeSupported;
import com.xworkz.application.application.dto.Type;
import com.xworkz.application.services.ApplicationServices;
import com.xworkz.application.services.imp.ApplicationServicesImp;

public class ApplicationServicesRunner {

	public static void main(String[] args) {

		ApplicationDTO applicationDTO = new ApplicationDTO();

		applicationDTO.setName("Instagram");

		applicationDTO.setDevelopedBy("Meta");

		applicationDTO.setVersion(274.4);

		applicationDTO.setSize(3);

		applicationDTO.setPrice(225);

		applicationDTO.setMinProcessorSpeed(225.5);

		applicationDTO.setMinRamSpaceRequired(400);

		applicationDTO.setRating(4.5);

		applicationDTO.setAgeLimit(24.2);

		applicationDTO.setType(Type.SOCIALMEDIAAPPLICATION);

		applicationDTO.setLangUsed(LangUsed.IOS);

		applicationDTO.setOsTypeSupportsd(OsTypeSupported.MAC);

		applicationDTO.setCreatedDate(LocalDate.of(2010, 10, 06));

		applicationDTO.setCurrentVersionReleaseDate(LocalDate.of(2023, 3, 12));

		applicationDTO.setFirstVersionReleaseDate(LocalDate.of(2010, 10, 6));

		applicationDTO.setNextVersionReleaseDate(LocalDate.of(2023, 10, 6));

		applicationDTO.setTrialDays(30);

		applicationDTO.setInternetNeeded(true);

		applicationDTO.setNoOfDownloads(78);

		System.out.println(applicationDTO);

		System.out.println("----------------------------------------------------------------------------");

		ApplicationServices applicationServices = new ApplicationServicesImp();
		boolean validate = applicationServices.validAndSave(applicationDTO);
		System.out.println("Validate: " + validate);

	}

}
