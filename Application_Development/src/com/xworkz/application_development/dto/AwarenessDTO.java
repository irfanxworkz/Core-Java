package com.xworkz.application_development.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AwarenessDTO implements Serializable {
	
	private String NameOfAwareness;
	private int typesOfAwareness;
	private LocalDateTime timePeriod;
	private boolean focus;
	
	public AwarenessDTO() {
		System.out.println("no-arg constructor from AwarenessDTO...");
	}
	
	
	
	@Override
	public String toString() {
		return "AwarenessDTO [NameOfAwareness=" + NameOfAwareness + ", typesOfAwareness=" + typesOfAwareness
				+ ", timePeriod=" + timePeriod + ", focus=" + focus + "]";
	}



	public String getNameOfAwareness() {
		return NameOfAwareness;
	}
	public void setNameOfAwareness(String nameOfAwareness) {
		NameOfAwareness = nameOfAwareness;
	}
	public int getTypesOfAwareness() {
		return typesOfAwareness;
	}
	public void setTypesOfAwareness(int typesOfAwareness) {
		this.typesOfAwareness = typesOfAwareness;
	}
	public LocalDateTime getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(LocalDateTime timePeriod) {
		this.timePeriod = timePeriod;
	}
	public boolean isFocus() {
		return focus;
	}
	public void setFocus(boolean focus) {
		this.focus = focus;
	}

}
