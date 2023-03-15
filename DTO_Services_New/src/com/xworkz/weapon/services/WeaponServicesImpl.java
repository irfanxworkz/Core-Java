package com.xworkz.weapon.services;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponServicesImpl implements WeaponServices{

	@Override
	public boolean validateAndThenSave(WeaponDTO dto) {
		
		System.out.println("validateAndThenSave method Running.."+dto);
		if(dto != null) {
			System.out.println("dto is not null");
			
			String name=dto.getName();
			String material=dto.getMaterial();
			String madeBy=dto.getMedeBy();
			String manufacturedBy=dto.getManufacturedBy();
			String usedBY=dto.getUsedBy();
			String usedFor=dto.getUsedFor();
			double cost=dto.getCost();
			double weight=dto.getWeight();
			int id=dto.getId();
			Type type=dto.getType();
			LocalDate manufacturedYear=dto.getManufacturedYear();
			
			boolean validName=false;
			boolean validMaterial=false;
			boolean validMedeBy=false;
			boolean validManufacturedBy=false;
			boolean validUsedBy=false;
			boolean validUsedFor=false;
			boolean validCost=false;
			boolean validWeight=false;
			boolean validId=false;
			boolean validType=false;
			boolean validManufacturedYear=false;
			
			if(name !=null && name.length()>3 && name.length()<30) {
				System.out.println("Name is Valid");
				validName=true;
			}
			else {
				System.err.println("Name is InValid ");
			}
			if(material !=null && material.length()>3 && material.length()<30) {
				System.out.println("material is Valid");
				validMaterial=true;
			}
			else {
				System.err.println("material is InValid ");
			}
			if(madeBy !=null && madeBy.length()>3 && madeBy.length()<50) {
				System.out.println("madeBy is Valid");
				validMedeBy=true;
			}
			else {
				System.err.println("madeBy is InValid ");
			}
			if(manufacturedBy !=null && manufacturedBy.length()>3 && manufacturedBy.length()<30) {
				System.out.println("manufacturedBy is Valid");
				validManufacturedBy=true;
			}
			else {
				System.err.println("manufacturedBy is InValid ");
			}
			if(usedBY !=null && usedBY.length()>3 && usedBY.length()<30) {
				System.out.println("usedBY is Valid");
				validUsedBy=true;
			}
			else {
				System.err.println("usedBY is InValid ");
			}
			if(usedFor !=null && usedFor.length()>3 && usedFor.length()<30) {
				System.out.println("usedFor is Valid");
				validUsedFor=true;
			}
			else {
				System.err.println("usedFor is InValid ");
			}
			if(cost >5000 && cost<1000000) {
				System.out.println("cost is Valid");
				validCost=true;
			}
			else {
				System.err.println("cost is InValid ");
			}
			if(weight >0.5 && weight<100) {
				System.out.println("weight is Valid");
				validWeight=true;
			}
			else {
				System.err.println("weight is InValid ");
			}
			if(id >0 && id<100) {
				System.out.println("id is Valid");
				validId=true;
			}
			else {
				System.err.println("id is InValid ");
			}
			if(type !=null) {
				System.out.println("type is Valid");
				validType=true;
			}
			else {
				System.err.println("type is InValid ");
			}
			LocalDate manufactured= LocalDate.ofYearDay(1949, 16);
			if(manufacturedYear !=null && manufacturedYear.equals(manufactured)) {
				System.out.println("manufacturedYear is Valid");
				validManufacturedYear=true;
			}
			else {
				System.err.println("manufacturedYear is InValid ");
			}
			
			if(validName && validMaterial && validMedeBy && validManufacturedBy && validUsedBy && validUsedFor && validCost && validWeight && validId && validType && validManufacturedYear)
			{
				System.out.println("Validation is Complete Save data");
				return true;
			}
			else {
				System.err.println("validation not complete not save data");
				return false;
			}
		}
		else {
			System.err.println("dto is null ");
		}
		
		return false;
	}

}
