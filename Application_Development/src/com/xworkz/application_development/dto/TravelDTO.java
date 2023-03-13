package com.xworkz.application_development.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TravelDTO implements Serializable{
	
	private String routeName;
	private double cost;
	private LocalDateTime currentDateTime;
	private double distance;
	
	public TravelDTO() {
		System.out.println("no-arg Constructor in TravelDTO...");
	}
	
	
	
	@Override
	public String toString() {
		return "TravelDTO: [routeName=" + routeName + ", Ticket Cost Rs:" + cost + ", currentDateTime=" + currentDateTime + ", distance="
				+ distance + "]";
	}



	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDateTime getCurrentTime() {
		return currentDateTime;
	}
	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	

}
