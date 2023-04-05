package com.xworkz.animal.boot;

import com.xworkz.animal.dto.AnimalDTO;
import com.xworkz.animal.exception.MemoryfullAnimalException;
import com.xworkz.animal.repositry.AnimalRepositry;
import com.xworkz.animal.repositry.AnimalRepositryImpl;
import com.xworkz.animal.services.AnimalServices;
import com.xworkz.animal.services.AnimalServicesImpl;
import com.xworkz.constant.AnimalType;

public class AnimalRunner {

	public static void main(String[] args) {
		
		AnimalDTO animalDto1 = new AnimalDTO("Tiger", "Brown", AnimalType.WILD, 12, 8.5, 45.5);
		AnimalDTO animalDto2 = new AnimalDTO("DogBaby", "Brown", AnimalType.DOMESTIC, 5, 3.5, 5.5);
		AnimalDTO animalDto3 = new AnimalDTO("CatBaby", "Brown", AnimalType.DOMESTIC, 3, 2.1, 2.5);
		AnimalDTO animalDto4 = new AnimalDTO("jiraff", "Brown", AnimalType.WILD, 30, 25.5, 88.5);
		AnimalDTO animalDto5 = new AnimalDTO("lion", "Brown", AnimalType.WILD, 15, 9.5, 78.5);
	
		
		AnimalRepositry repositry=new AnimalRepositryImpl();
		AnimalServices services=new AnimalServicesImpl(repositry);
		
		try {
			boolean validate1=services.validateAndSave(animalDto1);
			System.out.println("Validate1: "+validate1);
			System.out.println("---------------------------------------------------------------------------");
			boolean validate2=services.validateAndSave(animalDto2);
			System.out.println("Validate2: "+validate2);
			System.out.println("---------------------------------------------------------------------------");
			boolean validate3=services.validateAndSave(animalDto3);
			System.out.println("Validate3: "+validate3);
			System.out.println("---------------------------------------------------------------------------");
			boolean validate4=services.validateAndSave(animalDto4);
			System.out.println("Validate4: "+validate4);
			System.out.println("---------------------------------------------------------------------------");
			boolean validate5=services.validateAndSave(animalDto5);
			System.out.println("Validate5: "+validate5);
			System.out.println("---------------------------------------------------------------------------");
			//boolean validate6=services.validateAndSave(animalDto5);
			//System.out.println("Validate"+validate6);
		
			AnimalDTO f1=services.find(animalDto2);
			System.out.println(f1);
			System.out.println("----------------------------------");
			AnimalDTO f5=services.findByName("DogBaby");
			System.out.println(f5);
			System.out.println("----------------------------------");
			int f2=services.findLifeSpanByName("lion");
			System.out.println(f2);
			System.out.println("----------------------------------");
			String f3=services.findNameByLifeSpanAndWeightAndHeight(12, 8.5, 45.5);
			System.out.println(f3);
			System.out.println("----------------------------------");
			double f4=services.findHeightbyWeight(2.5);
			System.out.println(f4);
			System.out.println("----------------------------------");
			System.out.println("Total size: "+services.total());
			
		} catch (MemoryfullAnimalException e) {
			System.out.println(e.getMessage());
	
		}
		
		
		
		

		

	}

}
