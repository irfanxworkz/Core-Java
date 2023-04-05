package com.xworkz.animal.services;

import com.xworkz.animal.dto.AnimalDTO;

public interface AnimalServices {

	boolean validateAndSave(AnimalDTO dto);

	AnimalDTO find(AnimalDTO dto);

	AnimalDTO findByName(String name);

	int findLifeSpanByName(String name);

	String findNameByLifeSpanAndWeightAndHeight(int lifeSpan, double weight, double height);
	
	double findHeightbyWeight(double weight);

	int total();

}
