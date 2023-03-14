package com.xworkz.application_development.boot;

import java.time.LocalDateTime;
import java.time.LocalTime;

import com.xworkz.application_development.dto.AwarenessDTO;

public class AwarenessDTORunner {

	public static void main(String[] args) {
		
		AwarenessDTO awareness = new AwarenessDTO();
		awareness.setNameOfAwareness("Environmental awareness");
		awareness.setTypesOfAwareness(4);
		awareness.setTimePeriod(LocalDateTime.now());
		awareness.setFocus(true);
		
		System.out.println(awareness);
		System.out.println(awareness.hashCode()+" Original Hashcode "+System.identityHashCode(awareness));
		System.out.println(awareness.equals(awareness));
		

	}

}
