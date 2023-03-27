package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.LangUsed;
import com.xworkz.application.constant.OsTypeSupported;
import com.xworkz.application.constant.Type;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepository;
import com.xworkz.application.repository.ApplicationRepositoryImpl;
import com.xworkz.application.services.ApplicationServices;
import com.xworkz.application.services.ApplicationServicesImp;

public class ApplicationRunner {

	public static void main(String[] args) {

		ApplicationDTO applicationDTO = new ApplicationDTO("Instagram", "Meta", 12.4, 10, 5550, 25.5, 12, 35, 4.5, Type.SOCIALMEDIAAPPLICATION, OsTypeSupported.MAC, LangUsed.IOS, LocalDate.of(2010, 10, 06), LocalDate.of(2010, 10, 6), LocalDate.of(2023, 3, 12), LocalDate.of(2023, 10, 6), true, 78, 22);

		System.out.println("----------------------------------------------------------------------------");
		
		ApplicationRepository applicationRepository=new ApplicationRepositoryImpl();
		ApplicationServices applicationServices = new ApplicationServicesImp(applicationRepository);
		boolean validate = applicationServices.validAndSave(applicationDTO);
		System.out.println("Validate: " + validate);
		
		System.out.println("------------------------------------------------------------------------------");
		
		ApplicationDTO applicationDTO1 = new ApplicationDTO("Facebook", "Meta", 17.4, 15, 5207, 15.5, 22, 37, 6.5, Type.SOCIALMEDIAAPPLICATION, OsTypeSupported.WINDOWS, LangUsed.WINDOWS, LocalDate.of(2010, 10, 06), LocalDate.of(2010, 10, 6), LocalDate.of(2023, 3, 12), LocalDate.of(2023, 10, 6), false, 78, 32);
		ApplicationServices applicationServices1 = new ApplicationServicesImp(applicationRepository);
		boolean validate1 = applicationServices1.validAndSave(applicationDTO1);
		System.out.println("Validate: " + validate1);
	}

}
