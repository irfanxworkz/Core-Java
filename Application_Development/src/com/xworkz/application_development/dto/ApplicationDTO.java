package com.xworkz.application_development.dto;

import java.io.Serializable;
import java.time.LocalDate;

/* 5. Rules
1. implements Serializable
2. declare private property
3. Setter and Getter methods
4. no-arg constructor
5. non-final class

*/
public class ApplicationDTO implements Serializable{
	
	private String name;
	private String developedBy;
	private LocalDate createdDate;
	private double size;
	private double version;
	
	public ApplicationDTO() {
		System.out.println("no-arg Constructor in ApplicationDTO");
	}
	
	
	
	@Override
	public String toString() {
		return "ApplicationDTO: [name=" + name + "], [developedBy=" + developedBy + "] , [createdDate=" + createdDate
				+ "] , [ size=" + size + "] ,[ version=" + version + "]";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}

}
