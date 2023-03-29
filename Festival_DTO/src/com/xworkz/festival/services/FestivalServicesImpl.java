package com.xworkz.festival.services;

import java.time.LocalDate;

import com.xworkz.festival.constant.SweetName;
import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.exception.InvalidFestivalException;
import com.xworkz.festival.repository.FestivalRepository;
import static com.xworkz.festival.util.ValidationUtil.*;

public class FestivalServicesImpl implements FestivalServices {
	
	private FestivalRepository festivalRepository;
	

	public FestivalServicesImpl(FestivalRepository festivalRepository) {
		this.festivalRepository = festivalRepository;
	}


	@Override
	public boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException {
		
		System.out.println("validateAndThenSave method is running: "+dto);
		
		if(dto !=null) {
			System.out.println("dto is not null..");
			
			String festivalName=dto.getFestivalName();
			String godName=dto.getGodName();
			double id=dto.getId();
			SweetName sweetName=dto.getSweetName();
			LocalDate startDate=dto.getStartDate();
			LocalDate endDate=dto.getEndDate();
			
			boolean validFestivalName=false;
			boolean validGodName=false;
			boolean validId=false;
			boolean validSweetName=false;
			boolean validStartDate=false;
			boolean validEndDate=false;
			
			if(validString(festivalName)) {
				System.out.println("Festival Name is valid.");
				validFestivalName= true;
			}
			else {
				System.err.println("Festival name is invalid");
			}
			if(validString(godName)) {
				System.out.println("God Name is Valid.");
				validGodName= true;
			}
			else {
				System.err.println("God Name is invalid");
			}
			if(validId(id)) {
				System.out.println("Id is Valid");
				validId=true;
			}
			else {
				System.err.println("Id is invalid");
			}
			if(sweetName != null) {
				System.out.println("Sweet name is valid ");
				validSweetName=true;
			}
			else {
				System.err.println("SweetName is invalid");
			}
			if(validDate(startDate)) {
				System.out.println("StartDate is valid");
				validStartDate=true;
			}
			else {
				System.err.println("Start date is invalid");
			}
			if(validDate(endDate)) {
				System.out.println("Enddate is valid.");
				validEndDate=true;
			}
			else {
				System.out.println("Enddate is invalid");
			}
			if(valigFlag(validFestivalName,validGodName,validId,validSweetName,validStartDate,validEndDate)) {
				System.out.println("Validation is complete save data");
				boolean saved=festivalRepository.save(dto);
				return saved;
			}
			else {
				System.err.println("Validation is not completed not save data");
				return false;
			}
		}
		
		return false;
	}

}
