package com.xworkz.application_development.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

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
	
	

	@Override
	public int hashCode() {
		return Objects.hash(absent, candidateName, date, present);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceDTO other = (AttendanceDTO) obj;
		return absent == other.absent && Objects.equals(candidateName, other.candidateName)
				&& Objects.equals(date, other.date) && present == other.present;
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
