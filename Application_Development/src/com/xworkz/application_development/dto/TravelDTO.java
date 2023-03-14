package com.xworkz.application_development.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

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

	

	@Override
	public int hashCode() {
		return Objects.hash(cost, currentDateTime, distance, routeName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDTO other = (TravelDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
				&& Objects.equals(currentDateTime, other.currentDateTime)
				&& Double.doubleToLongBits(distance) == Double.doubleToLongBits(other.distance)
				&& Objects.equals(routeName, other.routeName);
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
