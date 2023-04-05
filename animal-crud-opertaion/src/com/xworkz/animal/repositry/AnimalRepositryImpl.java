package com.xworkz.animal.repositry;

import com.xworkz.animal.dto.AnimalDTO;
import com.xworkz.animal.exception.MemoryfullAnimalException;

public class AnimalRepositryImpl implements AnimalRepositry{

	private AnimalDTO animal[] =new AnimalDTO[5];
	private int animalIndex=0;
	
	@Override
	public boolean save(AnimalDTO dto) {
		if(this.animalIndex<this.animal.length)
		{
			animal[animalIndex]=dto;
			System.out.println("saving is correct");
			animalIndex++;
			return true;
		}
		else {
			System.out.println("Saving is not correct");
			throw new MemoryfullAnimalException("Memory is full");
		}
	}

	@Override
	public AnimalDTO find(AnimalDTO dto) {
		for(animalIndex=0; animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref=this.animal[animalIndex];
			if(ref.equals(dto)) {
				System.out.println("dto is found");
				return ref;
			}
		}
		return null;
	}

	@Override
	public AnimalDTO findByName(String name) {
		for(int animalIndex=0; animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref=this.animal[animalIndex];
			if(ref.equals(name)) {
				System.out.println("dto is found for Name");
				return ref;
			}
		}
		return null;
	}

	@Override
	public int findLifeSpanByName(String name) {
		for(animalIndex=0; animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref=this.animal[animalIndex];
			if(ref.getName().equals(name)) {
				System.out.println("dto is found for lifeSpan By Name");
				return ref.getLifeSpan();
			}
		}
		return 0;
	}

	@Override
	public String findNameByLifeSpanAndWeightAndHeight(int lifeSpan, double weight, double height) {
		for(animalIndex=0; animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref=this.animal[animalIndex];
			if(ref.getLifeSpan()==lifeSpan && ref.getWeight()==weight && ref.getHeight()==height) {
				System.out.println("dto is found for Name By lifeSpanAndWeightAndHeight");
				return ref.getName();
			}
		}
		return null;
	}

	@Override
	public double findHeightbyWeight(double weight) {
		for(animalIndex=0; animalIndex<this.animal.length;animalIndex++) {
			AnimalDTO ref=this.animal[animalIndex];
			if(ref.getWeight()==weight) {
				System.out.println("dto is found for height by weight");
				return ref.getHeight();
			}
		}
		return 0;
	}
	
	@Override
	public int total() {
		
		return this.animalIndex;
	}

	


}
