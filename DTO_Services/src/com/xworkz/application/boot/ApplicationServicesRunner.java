package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.OsTypeSupported;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.services.ApplicationServices;
import com.xworkz.application.services.ApplicationServicesImp;

public class ApplicationServicesRunner {

	public static void main(String[] args) {

		ApplicationDTO applicationDTO = new ApplicationDTO();

		applicationDTO.setName("Instagram");

		applicationDTO.setDevelopedBy("Meta");

		applicationDTO.setVersion(274.4);

		applicationDTO.setSize(10);

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
