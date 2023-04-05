package com.xworkz.animal.services;

import com.xworkz.animal.dto.AnimalDTO;
import com.xworkz.animal.repositry.AnimalRepositry;

import static com.xworkz.animal.util.ValidationUtil.*;

import com.xworkz.animal.constant.AnimalType;

public class AnimalServicesImpl implements AnimalServices {
	
	private AnimalRepositry animalRepositry;
	
	public AnimalServicesImpl(AnimalRepositry animalRepositry) {
		this.animalRepositry=animalRepositry;
	}
	
	@Override
	public boolean validateAndSave(AnimalDTO dto) {
		System.out.println("Running validateAndSave methods."+dto);
		
		if(dto != null) {
			System.out.println("dto is not null");
			
			String name=dto.getName();
			String color=dto.getColor();
			AnimalType type=dto.getType();
			int lifeSpan=dto.getLifeSpan();
			double weight=dto.getWeight();
			double height=dto.getHeight();
			
			boolean validName=false;
			boolean validColor=false;
			boolean validAnimalType=false;
			boolean validLifeSpan=false;
			boolean validWeight=false;
			boolean validHeight=false;
			
			if(validString(name)) {
				System.out.println("Name is Valid");
				validName=true;
			}
			else {
				System.err.println("Name is invalid");
			}

			if(validString(color)) {
				System.out.println("Color is Valid");
				validColor=true;
			}
			else {
				System.err.println("Color is invalid");
			}
			
			if(type !=null) {
				System.out.println("Type is Valid");
				validAnimalType=true;
			}
			else {
				System.err.println("type is invalid");
			}
			
			if(validDouble(weight)) {
				System.out.println("Weight is Valid");
				validWeight=true;
			}
			else {
				System.err.println("weight is invalid");
			}
			
			if(validDouble(height)) {
				System.out.println("Height is Valid");
				validHeight=true;
			}
			else {
				System.err.println("Height is invalid");
			}
			
			if(validInt(lifeSpan)) {
				System.out.println("LifeSpan is Valid");
				validLifeSpan=true;
			}
			else {
				System.err.println("LifeSpan is invalid");
			}
			
			if(validFlag(validName, validColor,validAnimalType, validWeight, validHeight, validLifeSpan)) {
				System.out.println("Validation is complete Dto Is valid save data");
				boolean saved=this.animalRepositry.save(dto);
				return saved;
			}
			else {
				System.err.println("Validation is not complete Dto is not valid Not save data.");
			}
		}
		else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public AnimalDTO find(AnimalDTO dto) {
		if(dto!=null) {
			return this.animalRepositry.find(dto);
		}
		return null;
	}

	@Override
	public AnimalDTO findByName(String name) {
		if(validString(name)) {
			return this.animalRepositry.findByName(name);
		}
		return null;
	}

	@Override
	public int findLifeSpanByName(String name) {
		if(validString(name)) {
			return this.animalRepositry.findLifeSpanByName(name);
		}
		return 0;
	}

	@Override
	public String findNameByLifeSpanAndWeightAndHeight(int lifeSpan, double weight, double height) {
		if(validInt(lifeSpan) && validDouble(weight) && validDouble(height)){
			return this.animalRepositry.findNameByLifeSpanAndWeightAndHeight(lifeSpan, weight, height);
		}
		return null;
	}
	
	@Override
	public double findHeightbyWeight(double weight) {
		if(validDouble(weight)) {
			return this.animalRepositry.findHeightbyWeight(weight);
		}
		return 0;
	}

	@Override
	public int total() {
		
		return this.animalRepositry.total();
	}

	
}
