package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.thing.PetAnimal;
import com.xworkz.inheritance.thing.Dog;

public class PetAnimalRunner 
{
	public static void main(String[] args) 
	{
		PetAnimal pet=new PetAnimal();
		pet.p2();
		PetAnimal pet2=new Dog();
		pet2.p2();
		Dog pet1=new Dog();
		pet1.p2();
	}
}