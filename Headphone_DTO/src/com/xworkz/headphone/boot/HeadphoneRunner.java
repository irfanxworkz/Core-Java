package com.xworkz.headphone.boot;

import java.time.LocalDate;

import com.xworkz.headphone.constant.Brand;
import com.xworkz.headphone.constant.Color;
import com.xworkz.headphone.constant.TypeAndWeight;
import com.xworkz.headphone.dto.HeadphoneDTO;
import com.xworkz.headphone.repository.HeadphoneRepository;
import com.xworkz.headphone.repository.HeadphoneRepositoryImpl;
import com.xworkz.headphone.services.HeadphoneServices;
import com.xworkz.headphone.services.HeadphoneServicesImpl;

public class HeadphoneRunner {

	public static void main(String[] args) {
		
		HeadphoneDTO headphoneDTO = new HeadphoneDTO(Brand.APPLE, Color.WHITE, TypeAndWeight.WIRELESS, "APPLESE12", "Irfan khan" , 12727, 1, 26556d, true, LocalDate.of(2023, 3, 15));
		System.out.println("Headphone Type is: "+TypeAndWeight.WIRELESS+" And Weight is:"+TypeAndWeight.WIRELESS.getWeight());
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		HeadphoneRepository headphoneRepository=new HeadphoneRepositoryImpl();
		
		HeadphoneServices headphoneServices= new HeadphoneServicesImpl(headphoneRepository);
		boolean validate=headphoneServices.validateAndThenSave(headphoneDTO);
		System.out.println("validate :"+validate);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		HeadphoneDTO headphoneDTO1=new HeadphoneDTO(Brand.BOAT, Color.BLACK, TypeAndWeight.WIRELESS, "Boat123", "Rahul Sharma", 12367567, 2, 1200, false, LocalDate.of(2021, 1, 26));
		HeadphoneServices headphoneServices1= new HeadphoneServicesImpl(headphoneRepository);
		boolean validate1=headphoneServices1.validateAndThenSave(headphoneDTO1);
		System.out.println("validate :"+validate1);
		

		
		
		
		
	}

}
