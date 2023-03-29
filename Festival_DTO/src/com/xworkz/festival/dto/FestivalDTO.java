package com.xworkz.festival.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.festival.constant.SweetName;

public class FestivalDTO implements Serializable {

	private String festivalName,godName;
	private double id;
	private SweetName sweetName;
	private LocalDate startDate,endDate;
	
	public FestivalDTO() {
		System.out.println("no-arg constructor in FestivalDTO");
	}

	public FestivalDTO(String festivalName, String godName, double id, SweetName sweetName, LocalDate startDate,
			LocalDate endDate) {
		super();
		this.festivalName = festivalName;
		this.godName = godName;
		this.id = id;
		this.sweetName = sweetName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "FestivalDTO: [festivalName=" + festivalName + ", godName=" + godName + ", id=" + id + ", sweetName="
				+ sweetName +" Price :"+SweetName.KAJU_KATLI.getPrice()+" color : "+SweetName.KAJU_KATLI.color()+", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(endDate, festivalName, godName, id, startDate, sweetName);
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof FestivalDTO)) {
			return false;
		}
		FestivalDTO other = (FestivalDTO) obj;
		return Objects.equals(endDate, other.endDate) && Objects.equals(festivalName, other.festivalName)
				&& Objects.equals(godName, other.godName)
				&& Double.doubleToLongBits(id) == Double.doubleToLongBits(other.id)
				&& Objects.equals(startDate, other.startDate) && sweetName == other.sweetName;
	}

	public String getFestivalName() {
		return festivalName;
	}

	public void setFestivalName(String festivalName) {
		this.festivalName = festivalName;
	}

	public String getGodName() {
		return godName;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public SweetName getSweetName() {
		return sweetName;
	}

	public void setSweetName(SweetName sweetName) {
		this.sweetName = sweetName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	
}
