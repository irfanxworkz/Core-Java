package com.xworkz.application_development.boot;

import java.time.LocalDateTime;
import java.time.LocalTime;

import com.xworkz.application_development.dto.TravelDTO;
import com.xworkz.application_development.dto.TravelDTO;

public class TravelDTORunner {

	public static void main(String[] args) {
		
		TravelDTO travel = new TravelDTO();
		
		travel.setRouteName("Mysore to Bengaluru");
		travel.setCost(750);
		travel.setCurrentDateTime(LocalDateTime.now());
		travel.setDistance(250);
		
		System.out.println(travel);
		System.out.println(travel.hashCode()+" Original Hashcode "+System.identityHashCode(travel));
		System.out.println(travel.equals(travel));
	}

}
