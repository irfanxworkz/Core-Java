package com.xworkz.application_development.dto;

import java.io.Serializable;
import java.util.Objects;

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

	

	@Override
	public int hashCode() {
		return Objects.hash(areaOfMarket, location, nameOfMarket, numberOfStore, typeOfMarket);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		return Double.doubleToLongBits(areaOfMarket) == Double.doubleToLongBits(other.areaOfMarket)
				&& Objects.equals(location, other.location) && Objects.equals(nameOfMarket, other.nameOfMarket)
				&& numberOfStore == other.numberOfStore && Objects.equals(typeOfMarket, other.typeOfMarket);
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
