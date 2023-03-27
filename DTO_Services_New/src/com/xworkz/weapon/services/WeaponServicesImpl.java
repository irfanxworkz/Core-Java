package com.xworkz.weapon.services;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;
import com.xworkz.weapon.repository.WeaponRepository;

import static com.xworkz.weapon.util.ValidationUtil.*;

public class WeaponServicesImpl implements WeaponServices{
	
	private WeaponRepository weaponRepository;

	public WeaponServicesImpl(WeaponRepository weaponRepository) {
		this.weaponRepository = weaponRepository;
	}

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
			
			if(validString(name)) {
				System.out.println("Name is Valid");
				validName=true;
			}
			else {
				System.err.println("Name is InValid ");
			}
			if(validString(material)) {
				System.out.println("material is Valid");
				validMaterial=true;
			}
			else {
				System.err.println("material is InValid ");
			}
			if(validString(madeBy)) {
				System.out.println("madeBy is Valid");
				validMedeBy=true;
			}
			else {
				System.err.println("madeBy is InValid ");
			}
			if(validString(manufacturedBy)) {
				System.out.println("manufacturedBy is Valid");
				validManufacturedBy=true;
			}
			else {
				System.err.println("manufacturedBy is InValid ");
			}
			if(validString(usedBY)) {
				System.out.println("usedBY is Valid");
				validUsedBy=true;
			}
			else {
				System.err.println("usedBY is InValid ");
			}
			if(validString(usedFor)) {
				System.out.println("usedFor is Valid");
				validUsedFor=true;
			}
			else {
				System.err.println("usedFor is InValid ");
			}
			if(validPrice(cost)) {
				System.out.println("cost is Valid");
				validCost=true;
			}
			else {
				System.err.println("cost is InValid ");
			}
			if(validWeight(weight)) {
				System.out.println("weight is Valid");
				validWeight=true;
			}
			else {
				System.err.println("weight is InValid ");
			}
			if(validId(id)) {
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
			
			if(valigFlag(validName, validMaterial, validMedeBy, validManufacturedBy, validUsedBy, validUsedFor,validCost,validWeight,validId,validType, validManufacturedYear))
			{
				System.out.println("Validation is Complete Save data");
				boolean saved=weaponRepository.save(dto);
				return saved;
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
