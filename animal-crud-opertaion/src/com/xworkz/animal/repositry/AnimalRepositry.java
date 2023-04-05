package com.xworkz.animal.repositry;

import com.xworkz.animal.dto.AnimalDTO;

public interface AnimalRepositry {

	boolean save(AnimalDTO dto);

	AnimalDTO find(AnimalDTO dto);

	AnimalDTO findByName(String name);

	int findLifeSpanByName(String name);

	String findNameByLifeSpanAndWeightAndHeight(int lifeSpan, double weight, double height);
	
	double findHeightbyWeight(double weight);

	 int total();
}
