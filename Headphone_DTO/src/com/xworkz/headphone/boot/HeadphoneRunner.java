package com.xworkz.headphone.boot;

import java.time.LocalDate;

import com.xworkz.headphone.constant.Brand;
import com.xworkz.headphone.constant.Color;
import com.xworkz.headphone.constant.TypeAndWeight;
import com.xworkz.headphone.dto.HeadphoneDTO;
import com.xworkz.headphone.services.HeadphoneServices;
import com.xworkz.headphone.services.HeadphoneServicesImpl;

public class HeadphoneRunner {

	public static void main(String[] args) {
		
		HeadphoneDTO headphoneDTO = new HeadphoneDTO(Brand.APPLE, Color.WHITE, TypeAndWeight.WIRELESS, "APPLESE12", "Irfan khan" , 12727, 1, 26556d, true, LocalDate.of(2020, 3, 15));
		System.out.println(headphoneDTO);
		System.out.println("Headphone Type is: "+TypeAndWeight.WIRELESS+" And Weight is:"+TypeAndWeight.WIRELESS.getWeight());
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		HeadphoneServices headphoneServices= new HeadphoneServicesImpl();
		boolean validate=headphoneServices.validateAndThenSave(headphoneDTO);
		System.out.println("validate :"+validate);
		
		
		
	}

}
