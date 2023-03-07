package com.xworkz.Multiple_Inheritance.things;

public abstract class AbstractInfo {
	
	private String createdBy;
	private String updatedBy;
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
		System.out.println("Created By :"+createdBy);
	}
	
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		System.out.println("Updated By: "+updatedBy);
	}

}
