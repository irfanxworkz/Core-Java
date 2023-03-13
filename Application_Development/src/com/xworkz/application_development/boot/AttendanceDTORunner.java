package com.xworkz.application_development.boot;

import java.time.LocalDate;

import com.xworkz.application_development.dto.AttendanceDTO;

public class AttendanceDTORunner {

	public static void main(String[] args) {
		
		AttendanceDTO attendance = new AttendanceDTO();
		attendance.setCandidateName("Irfan Khan");
		attendance.setPresent(true);
		attendance.setDate(LocalDate.now());
		attendance.setAbsent(false);
		
		System.out.println(attendance);
	}

}
