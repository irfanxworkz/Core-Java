package com.xworkz.festival.boot;

import java.time.LocalDate;

import com.xworkz.festival.constant.SweetName;
import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.exception.InvalidFestivalException;
import com.xworkz.festival.repository.FestivalRepository;
import com.xworkz.festival.repository.FestivalRepositoryImpl;
import com.xworkz.festival.services.FestivalServices;
import com.xworkz.festival.services.FestivalServicesImpl;

public class FestivalRunner {

	public static void main(String[] args) {
		
	try {
		FestivalDTO festivalDTO=new FestivalDTO("Diwali", "Laxmi", 1, SweetName.KAJU_KATLI, LocalDate.of(2023, 12, 22), LocalDate.of(2023, 12, 26));
		System.out.println("-----------------------------------------------------------------------------------------------");
		FestivalRepository festivalRepository=new FestivalRepositoryImpl();
		
		FestivalServices festivalServices=new FestivalServicesImpl(festivalRepository);
		boolean validate=festivalServices.validateAndThenSave(festivalDTO);
		System.out.println("Validate :"+validate);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		FestivalDTO festivalDTO1=new FestivalDTO("Holi", "Holika", 2, SweetName.COCONUT_LADDU, LocalDate.of(2023, 5, 21), LocalDate.of(2023, 5, 15));
		FestivalServices festivalServices1=new FestivalServicesImpl(festivalRepository);
		boolean validate1=festivalServices1.validateAndThenSave(festivalDTO1);
		System.out.println("Validate1: "+validate1);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		FestivalDTO festivalDTO2=new FestivalDTO("Dasara", "DurgaMata", 3, SweetName.RASMALAI, LocalDate.of(2023, 5, 21), LocalDate.of(2023, 5, 15));
		FestivalServices festivalServices2=new FestivalServicesImpl(festivalRepository);
		boolean validate2=festivalServices2.validateAndThenSave(festivalDTO2);
		System.out.println("Validate2: "+validate2);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		FestivalDTO festivalDTO3=new FestivalDTO("jaydumba", "Kali", 4, SweetName.GAJAR_KA_HALWA, LocalDate.of(2022, 5, 21), LocalDate.of(2022, 5, 15));
		FestivalServices festivalServices3=new FestivalServicesImpl(festivalRepository);
		boolean validate3=festivalServices3.validateAndThenSave(festivalDTO3);
		System.out.println("Validate3: "+validate3);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		FestivalDTO festivalDTO4=new FestivalDTO("ramnovmi", "Krishna", 5, SweetName.CHOCOLATE_BARFI, LocalDate.of(2021, 5, 21), LocalDate.of(2021, 5, 26));
		FestivalServices festivalServices4=new FestivalServicesImpl(festivalRepository);
		boolean validate4=festivalServices4.validateAndThenSave(festivalDTO4);
		System.out.println("Validate4: "+validate4);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		FestivalDTO festivalDTO5=new FestivalDTO("dipawali", "Shiva", 6, SweetName.ANJEER_KA_HALWA, LocalDate.of(2023, 5, 21), LocalDate.of(2023, 5, 15));
		FestivalServices festivalServices5=new FestivalServicesImpl(festivalRepository);
		boolean validate5=festivalServices5.validateAndThenSave(festivalDTO5);
		System.out.println("Validate5: "+validate5);
		System.out.println("-----------------------------------------------------------------------------------------------");
		FestivalDTO festivalDTO6=new FestivalDTO("dipawali", "Shiva", 6, SweetName.ANJEER_KA_HALWA, LocalDate.of(2023, 5, 21), LocalDate.of(2023, 5, 15));
		FestivalServices festivalServices6=new FestivalServicesImpl(festivalRepository);
		boolean validate6=festivalServices6.validateAndThenSave(festivalDTO6);
		System.out.println("Validate6: "+validate6);
	}
	
	catch (InvalidFestivalException  e) {
		System.out.println("InvalidFestivalException :" + e.getMessage());
	}
		
		
	}

}
