package com.xworkz.application_development.boot;

import java.time.LocalDate;

import com.xworkz.application_development.dto.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {
			
		ApplicationDTO applicationDto = new ApplicationDTO();
		applicationDto.setName("Instagram");
		applicationDto.setDevelopedBy("Meta");
		applicationDto.setCreatedDate(LocalDate.of(2010, 10, 6));
		applicationDto.setSize(249.2);
		applicationDto.setVersion(273.0);
		String str=applicationDto.getName();
		System.out.println("Application Name is :"+str);
		System.out.println(applicationDto);
	}

}
//date