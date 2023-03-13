package com.xworkz.application_development.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class AttendanceDTO implements Serializable{
	
	private String candidateName;
	private boolean present;
	private LocalDate date;
	private boolean absent;
	
	public AttendanceDTO() {
		System.out.println("no-arg Constructer in AttendanceDTO...");
	}
	
	@Override
	public String toString() {
		return "AttendanceDTO: [candidateName=" + candidateName + ", present=" + present + ", date=" + date + ", absent="
				+ absent + "]";
	}

	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public boolean isPresent() {
		return present;
	}
	public void setPresent(boolean present) {
		this.present = present;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public boolean isAbsent() {
		return absent;
	}
	public void setAbsent(boolean absent) {
		this.absent = absent;
	}
	
	

	
}
