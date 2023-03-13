package com.xworkz.application_development.dto;

import java.io.Serializable;

public class MarketDTO implements Serializable{
	
	private String nameOfMarket;
	private String typeOfMarket;
	private double areaOfMarket;
	private int numberOfStore;
	private String location;
	
	



	public MarketDTO() {
		System.out.println("no-arg Constructor MarketDTO.....");
	}
	
	
	
	@Override
	public String toString() {
		return "MarketDTO: [nameOfMarket=" + nameOfMarket + ", typeOfMarket=" + typeOfMarket + ", areaOfMarket="
				+ areaOfMarket + ", numberOfStore=" + numberOfStore + ", location=" + location + "]";
	}



	public String getNameOfMarket() {
		return nameOfMarket;
	}
	public void setNameOfMarket(String nameOfMarket) {
		this.nameOfMarket = nameOfMarket;
	}
	public String getTypeOfMarket() {
		return typeOfMarket;
	}
	public void setTypeOfMarket(String typeOfMarket) {
		this.typeOfMarket = typeOfMarket;
	}
	public double getAreaOfMarket() {
		return areaOfMarket;
	}
	public void setAreaOfMarket(double areaOfMarket) {
		this.areaOfMarket = areaOfMarket;
	}
	public int getNumberOfStore() {
		return numberOfStore;
	}
	public void setNumberOfStore(int numberOfStore) {
		this.numberOfStore = numberOfStore;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
